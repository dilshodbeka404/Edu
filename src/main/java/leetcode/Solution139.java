package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution139 {
    public static void main(String[] args) {
        System.out.printf(wordBreak("cars", new ArrayList<>(Arrays.asList("car", "ca", "rs"))) + "");
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        String ss = s;
        for (int i = 0; i < wordDict.size(); i++) {
            if (s.isEmpty()) return true;
            else {
                s = new String(ss);
                wordDict.remove(0);
            }
            breakW(s, wordDict);

        }
        return s.isEmpty();
    }

    private static void breakW(String s, List<String> wordDict) {
        for (String string : wordDict) {
            s = s.replace(string, "");
        }
    }
}
