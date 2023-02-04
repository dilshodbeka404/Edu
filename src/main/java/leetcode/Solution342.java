package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 12:10. 22/11/22
 */
public class Solution342 {
    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int n) {
        if (n == 1 || n == 4) return true;
        if (n < 4) return false;
        while (n > 1) {
            if (n % 4 != 0) return false;
            n = n / 4;
        }
        return true;
    }
}
