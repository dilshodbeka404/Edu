package leetcode;

public class Solution2108 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if(word == null || word.isEmpty()) continue;
            if (isPalindrome(word, word.length())) return word;
        }
        return null;
    }

    private boolean isPalindrome(String word, int length) {
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) return false;
        }
        return true;
    }
}
