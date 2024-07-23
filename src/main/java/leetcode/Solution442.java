package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution442 {
    public List<Integer> findDuplicatesMY(int[] nums) {
        Set<Integer> duplicatesSet = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (duplicatesSet.contains(num)) {
                duplicates.add(num);
            } else {
                duplicatesSet.add(num);
            }
        }

        return duplicates;
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length + 1];

        for (int i : nums) count[i]++;

        for (int i = 0; i <= nums.length; i++) {
            if (count[i] == 2) result.add(i);
        }

        return result;
    }

}
