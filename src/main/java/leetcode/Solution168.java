package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 10:39. 18/11/22
 */
public class Solution168 {
    public static void main(String[] args) {

    }

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int rem = (n - 1) % 26;
            sb.append((char) ('A' + rem));
            n = (n - 1) / 26;
        }
        sb.reverse();
        return sb.toString();
    }

}
