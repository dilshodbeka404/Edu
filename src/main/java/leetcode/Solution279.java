package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 12:26. 22/11/22
 */
public class Solution279 {
    public int numSquares(int n) {
        int count = 0;
        if (n % 4 == 0) return n / 4;
        else {
            count++;
            n -= 4;
        }

        if (n % 9 == 0) return count + n / 9;
        else {
            count++;
            n -= 9;
        }

        if (n % 16 == 0) return count + n / 16;
        else {
            count++;
            n -= 16;
        }
        return count + n;
    }
}
