package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 11:46. 21/11/22
 */
public class Solution283 {

//    public void moveZeroes(int[] nums) {
//        if (nums.length == 1) return;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] != 0) {
//                        int temp = nums[i];
//                        nums[i] = nums[j];
//                        nums[j] = temp;
//                    }
//                }
//            }
//        }
//    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int i = 0;
        for (int num : nums) {
            if (num != 0) nums[i++] = num;
        }
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

}
