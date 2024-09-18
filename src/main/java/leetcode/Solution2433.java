package leetcode;

/**
 * @author Dilshodbek Akhmedov, Wed 5:46 PM. 12/28/22
 */
public class Solution2433 {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        int val = 0;
        for (int i = 0; i < pref.length; i++) {
            arr[i] = pref[i] - val;
            val = Math.abs(val - pref[i]);
        }
        return arr;
    }

}
