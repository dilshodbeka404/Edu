package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2870 {

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        int result1 = minOperations(nums1);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        int[] nums2 = {2, 1, 2, 2, 3, 3};
        int result2 = minOperations(nums2);
        System.out.println("Example 2 Output: " + result2);
    }

    public static int minOperations(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int operations = 0;

        while (!frequencyMap.isEmpty()) {
            boolean found = false;

            for (int key : frequencyMap.keySet()) {
                if (frequencyMap.get(key) >= 2) {
                    frequencyMap.put(key, frequencyMap.get(key) - 2);
                    found = true;
                } else if (frequencyMap.get(key) >= 3) {
                    frequencyMap.put(key, frequencyMap.get(key) - 3);
                    found = true;
                }

                if (frequencyMap.get(key) == 0) {
                    frequencyMap.remove(key);
                }
            }

            if (!found) {
                return -1;
            }

            operations++;
        }

        return operations;
    }
}
