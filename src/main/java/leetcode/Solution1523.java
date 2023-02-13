package leetcode;

/**
 * @author Dilshodbek Akhmedov, Mon 9:32 AM. 2/13/23
 */
public class Solution1523 {

    public int countOdds(int low, int high) {
        if (low > high) return 0;
        if (low == high) return low % 2 == 1 ? 1 : 0;

        low = fixNum(low, 1);
        high = fixNum(high, -1);

        if (low == high) return 1;

        int count = 2;
        count += (high - low - 1) / 2;
        return count;
    }

    private int fixNum(int num, int idee) {
        return num % 2 == 1 ? num : num + idee;
    }

    public int countOdds2(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}