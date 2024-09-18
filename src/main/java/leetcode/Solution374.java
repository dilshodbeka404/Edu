package leetcode;

/**
 * @author Dilshodbek Akhmedov, Chor 10:08. 16/11/22
 */


/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is higher than the picked number
 * 1 if num is lower than the picked number
 * otherwise return 0
 * int guess(int num);
 */

public class Solution374 {
    static int pick = 121;

    public static void main(String[] args) {
        int i = guessNumber(121);
        System.out.println("i = " + i);
    }


    public static int guessNumber(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int m = guess(mid);
            if (m == 0) {
                return mid;
            } else if (m == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }


    public static int guess(int num) {
        if (num == pick) return 0;
        else if (pick > num) return -1;
        else return 1;
    }
}
