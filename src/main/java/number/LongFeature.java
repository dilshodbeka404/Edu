package number;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class LongFeature {
    public static void main(String[] args) {
        try {
            sayHello(5);
            sayHello(15);
        } catch (IOException e) {
            System.out.println(">>>>>>>>>> Socket timed out");
        }
    }


    static void sayHello(int num) throws IOException {
        System.out.println("Hello World");
        if (num > 10) {
            throw new SocketTimeoutException("SocketTimeoutException");
        }
    }
}
