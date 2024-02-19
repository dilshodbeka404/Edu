package leetcode;

import java.util.Arrays;

public class Solution292 {

    public int numSquares(int n) {
        // N oldindagi eng kam kvadrat sonlarning miqdorini saqlash uchun massivni yaratamiz
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Bazaviy holat: 0 ni 0 ga teng qilamiz
        dp[0] = 0;

        // Har bir son uchun eng kam kvadrat sonlarini hisoblash
        for (int i = 1; i <= n; i++) {

            // i soni uchun eng kam kvadrat sonlarining miqdorini hisoblash
            for (int j = 1; j * j <= i; j++) {

                // Har bir i soni uchun eng kam kvadrat sonlarining miqdorini hisoblash
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}
