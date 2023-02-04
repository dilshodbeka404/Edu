package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 11:21. 29/11/22
 */
public class Solution434 {
   static int count = 0;

    public static int countSegments(String s) {
        s = s.trim();
        putArraysTexts(s.trim());
        return count;
    }

    private static void putArraysTexts(String s) {
        int i = s.indexOf(' ');
        count++;
        if (i != -1) {
            s = s.substring(i);
        } else {
            return;
        }
        putArraysTexts(s);
    }

    public static void main(String[] args) {
        countSegments("Hello, my name is John");
    }
}