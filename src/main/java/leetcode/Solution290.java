package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Dush 12:06. 21/11/22
 */
public class Solution290 {
    public static void main(String[] args) {
        wordPattern("abba", "dog cat cat dog");
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        int i = 0;
        for (char c : pattern.trim().toCharArray()) {
            String val = map.get(c);
            String value = words[i++];
            if (Objects.isNull(val)) {
                if (map.containsValue(value)) return false;
                map.put(c, value);
            } else if (!val.equals(value)) {
                return false;
            }
        }
        return true;
    }
}
