package leetcode;

public class Solution2696 {

    public static void main(String[] args) {
        minLength("ABFCACDB");
    }

    public static int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean find = true;
        while (find) {
            int indexAB = sb.indexOf("AB");
            int indexCD = sb.indexOf("CD");

            if (indexAB != -1) {
                sb.delete(indexAB, indexAB + 2);
            } else if (indexCD != -1) {
                sb.delete(indexCD, indexCD + 2);
            } else {
                find = false;
            }
        }
        return sb.length();
    }
}
