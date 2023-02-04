package leetcode;

/**
 * @author Dilshodbek Akhmedov, Chor 16:16. 23/11/22
 */
public class Solution344 {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
