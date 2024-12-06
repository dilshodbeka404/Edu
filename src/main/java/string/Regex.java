package string;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dilshodbek Akhmedov, Chor 18:11. 09/11/22
 */
public class Regex {
    private static final Pattern pattern = Pattern.compile("^(\\d*)$");
    private static final Pattern pattern2 = Pattern.compile("^(\\d+\\.?\\d*$)");
//"^[0-9]+\.?[0-9]*$"
    public static void main(String[] args) {
        String number = "11611s.132445";
        Matcher matcher = pattern.matcher(number);
        System.out.println("matcher.matches() = " + matcher.matches());
        matcher = pattern2.matcher(number);
        System.out.println("matcher = " + matcher.matches());
        try {
            double d = Double.parseDouble(number);
            System.out.println("d = " + d);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

    public static void main0(String[] args) {
        String str = "000.0";

        // Barcha belgilar raqammi?
        if (Pattern.matches("\\d+",str)) {
            System.out.println("String faqat raqamlardan iborat");
            System.out.println("Integer.valueOf(str) = " + Integer.valueOf(str));
        } else {
            System.out.println("Stringda boshqa belgilar ham bor");
        }
    }
}
