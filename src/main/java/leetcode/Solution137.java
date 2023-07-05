package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution137 {
    public int singleNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer res = map.get(num);

            if (Objects.nonNull(res))
                map.put(num, res + 1);
            else
                map.put(num, 1);
        }
        return map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0);
    }

    public int singleNumber(int[] nums) {
        int o = 0;
        int t = 0;
        for (int num : nums) {
            o = (num ^ o) & ~t;
            t = (num ^ t) & ~o;
        }
        return o;
    }
}
