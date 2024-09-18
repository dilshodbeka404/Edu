package leetcode;

import java.time.LocalDate;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        int tmp = nums[0];
        int count = 1;
        boolean first = true;

        for (int i = 1; i < nums.length; i++) {
            if (first && tmp == nums[i]) {
                count++;
                first = false;
            } else if (tmp != nums[i]) {
                count++;
                first = true;
            }
        }
        return count;
    }

    public int removeDuplicate(int[] nums) {
        int l = nums.length;
        int[] ptemps = new int[l];

        int tmp = 0;
        for (int num : nums) {
            if (num >= l) {
                ptemps[num - 1] = num;
                tmp = num;
            }
        }
        return tmp;
    }

}
