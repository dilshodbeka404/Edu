package leetcode;

public class Solution241 {
    public static void main(String[] args) {
        nthUglyNumber(10);
    }

    public static int nthUglyNumber(int n) {
        if (n == 1) return 1;

        int order = n - 1;
        int num = 1;

         while (order > 0) {
             if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
                 order--;
             }
             num++;
         }

        return num;
    }
}
