package leetcode;

import java.util.*;

public class Solution179 {

    public static void main(String[] args) {
        largestNumber(new int[]{10, 2});
    }

    public static String largestNumber(int[] nums) {
        String[] list = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(list, (a, b) -> (a + b).compareTo(b + a));

        StringBuilder res = new StringBuilder();
        for (String i : list) {
            res.append(i);
        }
        return res.toString();
    }
}