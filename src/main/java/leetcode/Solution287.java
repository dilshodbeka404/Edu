package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {
    public int findDuplicateMY(int[] nums) {
        Set<Integer> duplicatesSet = new HashSet<>();

        for (int num : nums) {
            if (duplicatesSet.contains(num)) {
                return num;
            } else {
                duplicatesSet.add(num);
            }
        }

        return 0;
    }

    public int findDuplicate(int[] nums) {
        boolean[] val = new boolean[nums.length];
        for (int num : nums) {
            if (val[num]) {
                return num;
            }
            val[num] = true;
        }
        return 0;
    }
}
