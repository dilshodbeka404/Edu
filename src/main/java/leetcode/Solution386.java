package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution386 {

    public static void main(String[] args) {
        System.out.println("lexicalOrder(13) = " + lexicalOrder(13));
    }

    static List<Integer> result = new ArrayList<>();
    public static List<Integer> lexicalOrder(int n) {
        for (int i = 1; i <= 9; i++) {
            dfs(i, n);
        }
        return result;
    }

    private static void dfs(int curr, int n) {
        if (curr > n) return;
        result.add(curr);


        for (int i = 0; i <= 9; i++) {
            if (curr * 10 + i > n) break;
            dfs(curr * 10 + i, n);
        }
    }
}
