package leetcode;

public class Solution7 {
    public int reverse(int x) {
        int a = Math.abs(x);
        int b = 0;
        while (a > 0) {
            if (b > Integer.MAX_VALUE / 10 || (a % 10 > 7 && b == Integer.MAX_VALUE / 10)) return 0;
            b = b * 10 + a % 10;
            a = a / 10;
        }
        if (x < 0) b = -1 * b;
        return b;
    }
}

