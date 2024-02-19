package leetcode;

import java.util.*;

public class Solution17 {

    public static void main(String[] args) {
        letterCombinations("56");
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phoneMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();

        backtrack("", digits, phoneMap, result);
        return result;
    }

    private static void backtrack(String combination, String nextDigits, String[] phoneMap, List<String> result) {
        if (nextDigits.isEmpty()) {
            result.add(combination);
        } else {
            String letters = phoneMap[nextDigits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, nextDigits.substring(1), phoneMap, result);
            }
        }
    }
}
