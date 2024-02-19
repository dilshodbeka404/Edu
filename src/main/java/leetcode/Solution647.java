package leetcode;

public class Solution647 {
    public static void main(String[] args) {
        countSubstrings("aaa");
    }
    public static int countSubstrings(String s) {
        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                count += panidromic(i, j, s);
            }
        }

        return count;
    }

    private static int panidromic(int start, int end, String text) {
        while (start != end) {
            if (text.charAt(start) != text.charAt(end)) return 0;
            start++;
            end--;
        }
        return 1;
    }
}
