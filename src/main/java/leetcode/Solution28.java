package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 16:43. 13/12/22
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }

    }
}
