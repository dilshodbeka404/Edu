package leetcode;

import java.util.Arrays;

public class Solution455 {
    public static void main(String[] args) {

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int result = 0;
        for (int children : g) {
            for (int j = i; j < s.length; j++) {
                i++;

                if (children >= s[j]) {
                    result++;
                    break;
                } else {
                    children -= s[j];
                }
            }
            if (i == s.length) break;
        }

        return result;
    }

    public int findContentChildrens(int[] g, int[] s) {
        int cookiesNums = s.length;
        if (cookiesNums == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int maxNum = 0;
        int cookieIndex = cookiesNums - 1;
        int childIndex = g.length - 1;
        while (cookieIndex >= 0 && childIndex >= 0) {
            if (s[cookieIndex] >= g[childIndex]) {
                maxNum++;
                cookieIndex--;
            }
            childIndex--;
        }

        return maxNum;
    }
}

