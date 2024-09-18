package leetcode;

import java.util.Arrays;

/**
 * @author Dilshodbek Akhmedov, Jum 15:10. 11/11/22
 */
public class Solution202 {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.toString(args));
        int val = 91;
        while (val != 1 && val != 4) {
            val = isHappys(val);
        }
        System.out.println("val = " + val);

    }

    public static int isHappys(int n) {
        int sum = 0;
        int a;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            sum += a * a;
        }
        return sum;
    }
}
