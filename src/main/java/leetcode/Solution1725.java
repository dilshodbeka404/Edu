package leetcode;

public class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int count  = 0;
        int max = 0;

        for (int[] rectangle : rectangles) {
            int num = Math.min(rectangle[0], rectangle[1]);
            if (max <  num) {
                max = num;
                count = 1;
            } else if (max == num) {
                count++;
            }
        }

        return count;
    }
}
