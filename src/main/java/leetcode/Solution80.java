package leetcode;

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
}
