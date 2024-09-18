package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 11:40. 28/11/22
 */
public class Solution414 {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;

        for (Integer num : nums) {
            if (num > a) {
                c = b;
                b = a;
                a = num;
            } else if (a > num && num > b) {
                c = b;
                b = num;
            } else if (b > num && num > c) {
                c = num;
            }
        }

        return c == Long.MIN_VALUE ? (int) a : (int) c;
    }
}
