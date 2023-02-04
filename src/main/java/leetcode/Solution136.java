package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dilshodbek Akhmedov, Pay 15:05. 17/11/22
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                numbers.remove(num);
            } else numbers.add(num);
        }
        return numbers.iterator().next();
    }

}
