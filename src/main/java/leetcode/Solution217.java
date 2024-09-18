package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Shan 16:33. 19/11/22
 */
public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Object> numbers = new HashMap<>();

        for (int num : nums) {
            if (numbers.containsKey(num)) return true;
            else numbers.put(num, null);
        }
        return false;
    }
}
