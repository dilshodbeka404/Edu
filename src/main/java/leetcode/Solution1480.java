package leetcode;

/**
 * @author Dilshodbek Akhmedov, Pay 18:13. 10/11/22
 */
public class Solution1480 {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0){
                nums[i] = nums[i] + nums[i - 1];
            }
        }
        return nums;
    }
}
