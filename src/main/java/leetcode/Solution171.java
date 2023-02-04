package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 15:00. 18/11/22
 */
public class Solution171 {
    public static void main(String[] args) {
        System.out.println("args = " + titleToNumber("AD"));

    }

    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for (char c : columnTitle.toCharArray()) {
            sum = sum * 26 + (int) c - '@';
        }
        return sum;
    }

}