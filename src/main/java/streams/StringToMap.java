package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dilshodbek Akhmedov, Fri 3:02 PM. 2/10/23
 */
public class StringToMap {
    public static void main(String[] args) {
        String text = "tg_1:111,tg_2:222,tg_3:333";

        Map<String, String> map = Arrays.stream(text.split(","))
                                        .map(s -> s.split(":", 2))
                                        .collect(Collectors.toMap(s -> s[0].trim(),
                                                                  s -> s[1].trim()));
        System.out.println("map = " + map);
    }
}
