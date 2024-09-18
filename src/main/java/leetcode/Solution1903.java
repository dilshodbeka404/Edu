package leetcode;

public class Solution1903 {
    public static void main(String[] args) {
        System.out.printf("RESULT: " + largestOddNumber("52"));
    }

    public static String largestOddNumber(String num) {
        if (num.charAt(num.length() - 1) % 2 == 1) return num;
        int i = num.length() - 1;
        while (i >= 0) {
            int n = num.charAt(i);
            if (n % 2 == 1) return num.substring(0, i + 1);
            i--;
        }
        return "";
    }
}
