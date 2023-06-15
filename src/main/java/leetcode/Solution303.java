package leetcode;


public class Solution303 {
    class NumArray {
        int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            int result = 0;
            for (int i = left; i <= right; i++) {
                result = result + nums[i];
            }
            return result;
        }
    }

}
