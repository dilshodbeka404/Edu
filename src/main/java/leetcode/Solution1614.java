package leetcode;

public class Solution1614 {

    public int maxDepth(String s) {
        int count = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if ('(' == c) {
                count++;
            } else if (')' == c) {
                count--;
            }

            if (count > max) max = count;
        }

        return max;
    }

}
