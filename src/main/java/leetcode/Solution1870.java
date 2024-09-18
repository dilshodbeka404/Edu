package leetcode;

public class Solution1870 {

    public static void main(String[] args) {
        minSpeedOnTime(new int[]{1, 1, 100000}, 2.01);
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length - 1 >= hour) return -1;
        if (dist.length <= hour) return 1;

        int max = 0;
        for (int dis : dist) {
            if (max < dis) max = dis;
        }

        if (hour % 1 == 0) return max;
        float speed = (float) (dist[dist.length - 1] / (hour % 1));

        speed = (speed > max) ? speed : max;
        speed = (speed % 1 > 0) ? speed + 1 : speed;
        return (int) speed;
    }
}
