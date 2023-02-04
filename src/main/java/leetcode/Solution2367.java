package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dilshodbek Akhmedov, Thu 11:08 AM. 1/5/23
 */
public class Solution2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int count = 0;
//        for (int num : nums) {
//            if (set.contains(num + diff) && set.contains(num + (2 * diff)))
//                count++;
//        }
//        return count;
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num - 2 * diff)) {
                res++;
            }
            set.add(num);
        }
        return res;
    }
}
