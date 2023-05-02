package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution387 {
    public int firstUniqChar(String s) {
        if(s.length() == 1) return 0;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String str = map.get(ch);
            if (Objects.isNull(str)) {
                String substring = s.substring(i + 1);
                if (substring.contains(ch + "")) {
                    map.put(ch, "");
                } else return i;
            }
        }
        return -1;
    }
}
