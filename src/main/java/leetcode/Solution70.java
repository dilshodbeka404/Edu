package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 09:29. 12/12/22
 */
public class Solution70 {
    public int climbStairs(int n) {
        int a1 = 0;
        int a2 = 2;
        int a3 = 3;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;

        for (int i = 3; i < n; i++) {
            a1 = a3;
            a3 = a2 + a3;
            a2 = a1;
        }
        return a3;
    }
}
