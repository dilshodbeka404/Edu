package leetcode;

/**
 * @author Dilshodbek Akhmedov, Pay 14:07. 10/11/22
 */
public class Solution1323 {
    public static void main(String[] args) {

    }

    public int maximum69Number (int num) {
        String val = num + "";
        return Integer.parseInt(val.replaceFirst("6", "9"));
    }
}
