package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println("anagram = " + anagram);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        List<Character> chars = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            chars.add(c);
        }

        for (char c : t.toCharArray()) {
            if (!chars.remove(Character.valueOf(c))) return false;
        }

        return chars.size() == 0;
    }
}
