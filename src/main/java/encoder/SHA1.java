package encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Dilshodbek Akhmedov, Sun 3:20 PM. 2/5/23
 */
public class SHA1 {
    public static void main(String[] args) {
        String passwordDigest = getPasswordDigest("test@123");
        System.out.println("passwordDigest = " + passwordDigest);
    }

    public static String getPasswordDigest(String password) {
        String s = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA1");
            digest.update(password.getBytes());
            s = Hex.toHexString(digest.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("e = " + e);
        }
        return s;
    }

    public static void hi(String... strings){
        for (String txt : strings) {
            System.out.println("s = " + txt);
        }
    }
}
