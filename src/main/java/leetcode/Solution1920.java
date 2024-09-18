package leetcode;

/**
 * @author Dilshodbek Akhmedov, Tue 10:29 AM. 1/10/23
 */
public class Solution1920 {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
