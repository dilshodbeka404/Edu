package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 09:59. 18/11/22
 */
public class Solution263 {
    public static void main(String[] args) {

    }

    public boolean isUgly(int n) {
//        if (n == 1) return true;
//        else if (n < 1) return false;
//        int div = 2;
//
//        while (5 >= div) {
//            if (n % div == 0) {
//                n = n / div;
//            } else {
//                div++;
//            }
//        }
//        return n == 1;

//        if (n == 0) return false;
//        /* a small trick to iterate 2,3,5 (and skip 4)*/
//        for (int i = 2; i <= 5; i += i - 1)
//            while (n % i == 0)
//                n /= i;
//        return n == 1;

        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return n == 1;
    }

}
