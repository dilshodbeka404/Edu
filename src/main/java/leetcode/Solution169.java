package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Jum 14:44. 18/11/22
 */
public class Solution169 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int element = majorityElement(nums);
        System.out.println("element = " + element);
    }


    public static int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            if (num != res) {
                count--;
            } else {
                count++;
            }
        }
        return res;
    }


    public static int majorityElement2(int[] nums) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        for (int key : nums) {
            Integer value = numberCountMap.getOrDefault(key, 0) + 1;
            numberCountMap.put(key, value);
        }

        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) return entry.getKey();
        }
        return 0;
    }
}
