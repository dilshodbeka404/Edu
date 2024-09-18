package socket;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Provides connectivity with transaction server
 */


@Getter
@Setter
public class TransactionClient {

    private String host;
    private Integer port;
    private Socket socket;

    public TransactionClient() {
    }

    public TransactionClient(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    /**
     * Makes request to transaction server
     *
     * @param request Query string in {@code field1=value1&field2=value2 } format
     * @return Parsed key-value pairs
     * @throws IOException in case of communication error with transaction server
     */
    public Map<String, String> makeRequest(String request) throws IOException {
        OutputStream out = getSocket().getOutputStream();
        InputStream in = getSocket().getInputStream();
        out.write(request.getBytes());
        //byte[] buffer = new byte[4096];
        getSocket().setSoTimeout(125000);

        //int nBytes = in.read(buffer);
        byte[] buffer = in.readAllBytes();

        getSocket().close();
        //String response = new String(buffer, 0, nBytes);
        String response = new String(buffer, 0, buffer.length);
        System.out.println("Transaction server host: " + getHost() + ", port: " + getPort() + ", request: " + request + ", response: " + response);
        return parseResponse(response);
    }

    /**
     * Parses transaction server response into key-value pairs
     *
     * @param response A response string from transaction server
     * @return Transaction server response as key-value pairs
     */
    public Map<String, String> parseResponse(String response) {
        Map<String, String> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(response, "&");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int pos = token.indexOf('=');
            if (pos != -1) {
                String key = token.substring(0, pos);
                String value = token.substring(pos + 1);
                value = URLDecoder.decode(value, StandardCharsets.UTF_8);
                map.put(key, value);
            }
        }
        System.out.println("map = " + map);
        return map;
    }

    /**
     * Opens socket with transaction server if socket is not opened yet
     *
     * @return Socket
     * @throws IOException when error during connection with transaction server occurs
     */
    public Socket getSocket() throws IOException {
        if (socket == null) {
            socket = new Socket(getHost(), getPort());
        }
        return socket;
    }

    /**
     * Sets open socket
     *
     * @param socket Socket object
     */
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
