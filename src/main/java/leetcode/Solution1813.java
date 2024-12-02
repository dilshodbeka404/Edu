package leetcode;

public class Solution1813 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.equals(sentence2)) return true;

        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

        int i = 0, m = s1.length - 1;
        int j = 0, n = s2.length - 1;

        // Increment both start indices while matching
        while (i <= m && j <= n && s1[i].equals(s2[j])) {
            i++;
            j++;
        }

        // Decrement both end indices while matching
        while (m >= i && n >= j && s1[m].equals(s2[n])) {
            m--;
            n--;
        }

        // Check if the remaining portion is a match
        return m < i || n < j;
    }
}
