package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 11:32. 22/11/22
 */
public class Solution338 {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int result;
        for (int i = 0; i <= n; i++) {
            result = bitCount(i);
            bits[i] = result;
        }
        return bits;
    }
    public int bitCount(int i) {
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }
}
