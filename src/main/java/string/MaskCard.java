package string;

import java.util.StringTokenizer;

/**
 * @author Dilshodbek Akhmedov, Dush 17:04. 07/11/22
 */
public class MaskCard {
    public static void main(String[] args) {
        System.out.println(maskCardholder("Dilshodbek Axmedov Kamiljan ug'li"));

        String str = "8600012341234708";
        System.out.println(maskString(str));
    }

    private static String maskString(String strText) {
        int maskLength = 8;
        String sbMaskString = "*".repeat(maskLength);
        return strText.substring(0, 6) + sbMaskString + strText.substring(6 + maskLength);
    }

    public static String maskCardholder(String cardholder) {
        StringTokenizer holderNames = new StringTokenizer(cardholder, " ");
        StringBuilder maskHolderName = new StringBuilder();
        while (holderNames.hasMoreTokens()) {
            String token = holderNames.nextToken();
            if (token.length() > 1)
                maskHolderName.append(token.charAt(0))
                        .append("*".repeat(token.length() - 1))
                        .append(" ");
            else
                maskHolderName.append(token).append(" ");
        }
        return maskHolderName.toString();
    }
}
