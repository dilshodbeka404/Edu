package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution884 {
    Map<String, Boolean> map = new HashMap<>();
    public String[] uncommonFromSentences(String s1, String s2) {
        checkUncommon(s1);
        checkUncommon(s2);

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Boolean> stringBooleanEntry : map.entrySet()) {
            if (!stringBooleanEntry.getValue()) res.add(stringBooleanEntry.getKey());
        }

        return res.toArray(new String[0]);
    }

    private void checkUncommon(String s1) {
        for(String s : s1.split(" ")) {
            if (map.containsKey(s)) {
                map.put(s, Boolean.TRUE);
            } else {
                map.put(s, Boolean.FALSE);
            }
        }
    }
}
