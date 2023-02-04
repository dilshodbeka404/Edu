package leetcode;

/**
 * @author Dilshodbek Akhmedov, Shan 20:49. 26/11/22
 */
public class Solution392 {

    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean subsequence = isSubsequence(s, t);
    }

    public static boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            int in = t.indexOf(s.charAt(i));
            if (in > -1) {
                try {
                    t = t.substring(in + 1);
                }catch (Exception e){
                    return false;
                }
            } else return false;
        }
        return true;
    }
}
