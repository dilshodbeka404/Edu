package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 12:14. 29/11/22
 */
public class Solution441 {
    public int arrangeCoins(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
        }
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }

//    public int arrangeCoins(int n) {
//        int count = 0;
//        int i = 1;
//        while (n > 0 && i <= n) {
//            count++;
//            n = n - i++;
//        }
//        return count;
//    }
}
