package encoder;

public class DynamicKeyEncoderDecoder {
    private static final int KEY_INCREMENT = -8; // Increment value for key

    public static void main(String[] args) {
        String message = "Hello, World!";
        String key = "secret";

        System.out.println("Original Message: " + message);

        // Encode the message
        String encodedMessage = encode(message, key);
        System.out.println("Encoded Message: " + encodedMessage);

        // Decode the message
        String decodedMessage = decode(encodedMessage, key);
        System.out.println("Decoded Message: " + decodedMessage);
    }

    public static String encode(String message, String key) {
        char[] messageChars = message.toCharArray();
        char[] keyChars = key.toCharArray();
        char[] encodedChars = new char[messageChars.length];

        for (int i = 0; i < messageChars.length; i++) {
            encodedChars[i] = (char) (messageChars[i] + keyChars[i % keyChars.length] + KEY_INCREMENT);
        }

        return new String(encodedChars);
    }

    public static String decode(String encodedMessage, String key) {
        char[] encodedChars = encodedMessage.toCharArray();
        char[] keyChars = key.toCharArray();
        char[] decodedChars = new char[encodedChars.length];

        for (int i = 0; i < encodedChars.length; i++) {
            decodedChars[i] = (char) (encodedChars[i] - keyChars[i % keyChars.length] - KEY_INCREMENT);
        }

        return new String(decodedChars);
    }
}