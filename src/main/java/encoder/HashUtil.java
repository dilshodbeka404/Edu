package encoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class HashUtil {

    public static String getSHA256Hash(String value) {
        try {
            // SHA-256 algoritmini yaratish
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // String qiymatni bytes formatiga o'zgartirish
            byte[] encodedHash = digest.digest(value.getBytes(StandardCharsets.UTF_8));

            // Hash qiymatini hex formatiga o'zgartirish
            StringBuilder hexString = new StringBuilder(2 * encodedHash.length);
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString().toUpperCase(Locale.ROOT);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String value = "Hello World";
        String hashValue = getSHA256Hash(value);
        System.out.println("Value: " + value);
        System.out.println("SHA-256 Hash: " + hashValue);
        //a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e
        //a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e
    }
}


