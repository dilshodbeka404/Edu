package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLRegex {

    public static void main(String[] args) {
        String url = "http://cto.api.uz";
        String url2 = null;
        if (isValidURL2(url2)) {
            System.out.println("URL is valid");
        } else {
            System.out.println("URL is not valid");
        }
    }

    public static boolean isValidURL(String url) {
        Matcher matcher = Pattern.compile("^https?://.*$").matcher(url);
        return matcher.matches();
    }
    public static boolean isValidURL2(String url) {
        return Pattern.matches("^https?://.*$", url);
    }


}
