package leetcode;

/**
 * @author Dilshodbek Akhmedov, Thu 5:40 PM. 1/19/23
 */
public class Solution1009 {
    public int bitwiseComplement(int n) {
//        int val = 0;
//        while (n > 0) {
//            val += n % 2;
//            n /= 2;
//        }
//        return val % 2;
        int x = 1;
        while (n > x)
            x = x * 2 + 1;
        return x - n;
    }
}
