package leetcode;

public class Solution1768 {
    public static void main(String[] args) {
        mergeAlternately("abcd", "ef");
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0, w1 = word1.length(), w2 = word2.length(); i <= w1 && j <= w2; i++, j++) {
            if (i < w1) result.append(word1.charAt(i));
            if (j < w2) result.append(word2.charAt(j));
        }
        return result.toString();
    }
}
