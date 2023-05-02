package leetcode;

public class Solution1822 {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int n : nums) {
            if (n == 0) return 0;
            sign *= n > 0 ? 1 : -1;
        }
        return sign;
    }
}
