package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 17:03. 14/11/22
 */
public class Solution125 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
