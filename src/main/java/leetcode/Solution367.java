package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 10:49. 25/11/22
 */
public class Solution367 {
    public static boolean isPerfectSquare(int num) {
        double pow = Math.pow(num, 1d / 2);
        int i = (int) pow;
        return pow == i;
    }
}
