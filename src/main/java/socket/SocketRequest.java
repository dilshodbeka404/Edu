package socket;

import java.io.*;
import java.net.Socket;

/**
 * @author Dilshodbek Akhmedov, Wed 3:03 PM. 1/11/23
 */
public class SocketRequest {

    private static Socket socket;
    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;
    private static String req = "ip=192.168.211.37" +
            "&channel_id=9" +
            "&terminal_id=4099608" +
            "&service_id=26311" +
            "&action=1" +
            "&web_user_id=305146" +
            "&VERSION=3.0.2" +
            "&ACT=1" +
            "&PASSWORDHASH=621A073881553E4DCA27FB29AF5B3693C57CA2C5" +
            "&USER_ID=422523" +
            "&SID=1D0E33D5752390EAF4E3E342910CDBB0" +
            "&customer=998943220433" +
            "&telefon=998941465977" +
            "&amount=1000" +
//            "&pay_amount=10000" +
//            "&sms_code=599603" +
            "&LANG=ru";

//    public static void main(String[] args) {
//        try {
//            InetAddress host = InetAddress.getByName("localhost");
//            socket = new Socket(host.getHostName(), 44399);
//            oos = new ObjectOutputStream(socket.getOutputStream());
//
//            System.out.println("Sending request to Socket Server");
//            oos.writeObject(req);
//            ois = new ObjectInputStream(socket.getInputStream());
//
//            String message = (String) ois.readObject();
//            System.out.println("Message: " + message);
//
//            ois.close();
//            oos.close();
//        } catch (Exception e) {
//            System.out.println("e = " + e);
//        }
//    }

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 44399);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());

            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

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

