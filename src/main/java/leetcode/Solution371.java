package leetcode;

/**
 * @author Dilshodbek Akhmedov, Fri 10:53 AM. 1/13/23
 */
public class Solution371 {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
