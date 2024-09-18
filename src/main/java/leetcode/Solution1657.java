package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Jum 16:45. 02/12/22
 */
public class Solution1657 {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        List<Character> wordChars = new ArrayList<>();
        for (int i = 0; i < word1.length(); i++) {
            wordChars.add(word1.charAt(i));
            wordChars.remove(Character.valueOf(word2.charAt(i)));
        }
        return wordChars.size() == 2;
    }
}