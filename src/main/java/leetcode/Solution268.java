package leetcode;

public class Solution268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int target = (1 + nums.length) * nums.length  / 2;
        return target - sum;
    }
}
