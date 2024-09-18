package leetcode;

public class Solution2101 {
    public int maximumDetonation(int[][] bombs) {
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < bombs.length - 1; i++) {
            for (int j = 1; j < bombs.length; j++) {
                if (isIntersect(bombs[i], bombs[j])) {
                    tmp++;
                }
            }
            if (max < tmp) max = tmp;
            tmp = 0;
        }
        return max;
    }

    public boolean isIntersect(int[] bombOne, int[] bombTwo) {
        double length = Math.sqrt(
                (bombTwo[0] - bombOne[0]) * (bombTwo[0] - bombOne[0])
                        +
                        (bombTwo[1] - bombOne[1]) * (bombTwo[1] - bombOne[1])
        );

        return length <= bombOne[2] + bombTwo[2];
    }
}
