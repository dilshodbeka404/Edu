package socket;

import java.io.*;
import java.net.Socket;

/**
 * @author Dilshodbek Akhmedov, Wed 3:03 PM. 1/11/23
 */
public class SocketRequest {

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 44399);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());

            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            String req = "ip=192.168.211.37" +
                    "&channel_id=9" +
                    "&service_id=39391" +
                    "&action=1" +
                    "&web_user_id=524464" +
                    "&VERSION=3.0.2" +
                    "&ACT=1" +
                    "&PASSWORDHASH=621A073881553E4DCA27FB29AF5B3693C57CA2C5" +
                    "&USER_ID=422523" +
                    "&SID=1D0E33D5752390EAF4E3E342910CDBB0" +
                    "&transactionId=12189706184" +
                    "&hermes_service_id=1192" +
                    "&LANG=ru";

            out.writeUTF(req);
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println(in.readLine());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

