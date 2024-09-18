package number;

import java.security.SecureRandom;


public class RandomGenerator {
    public static void main(String[] args) {
        String string = randomString(64);
        System.out.println("string = " + string.length());
        System.out.println("string = " + string);
    }
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}
