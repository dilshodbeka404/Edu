package string;

import java.util.StringTokenizer;

/**
 * @author Dilshodbek Akhmedov, Dush 17:04. 07/11/22
 */
public class MaskCard {
    public static void main(String[] args) {
        System.out.println(maskCardholder("Dilshodbek Axmedov Kamiljan"));

        String str = "8600021041783708";
        System.out.println(maskString(str));
    }

    private static String maskString(String strText) {
        int maskLength = 6;
        String sbMaskString = "*".repeat(maskLength);
        return strText.substring(0, 6) + sbMaskString + strText.substring(6 + maskLength);
    }

    public static String maskCardholder(String cardholder) {
        StringTokenizer holderNames = new StringTokenizer(cardholder, " ");
        StringBuilder maskHolderName = new StringBuilder();
        while (holderNames.hasMoreTokens()) {
            String token = holderNames.nextToken();
            maskHolderName.append(token.charAt(0)).append("******").append(token.charAt(token.length() - 1)).append(" ");
        }
        return maskHolderName.toString();
    }
}
