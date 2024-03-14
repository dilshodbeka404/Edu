package leetcode;

public class Solution541 {
    public static void main(String[] args) {
        System.out.println("reverseStr(\"abcdefg\", 2) = " + reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        boolean isRevers = false;

        for (int i = 0; i < s.length(); i += k) {

            String cache;
            if (i + k < s.length()) {
                cache = s.substring(i, i + k);
            } else {
                cache = s.substring(i);
            }

            if (isRevers) {
                result.append(cache);
                isRevers = false;
            } else {
                result.append(reverser(cache));
                isRevers = true;
            }
        }

        return result.toString();
    }

    private static String reverser(String str) {
        return (new StringBuilder(str)).reverse().toString();
    }

}
