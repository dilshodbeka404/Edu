package leetcode;

/**
 * @author Dilshodbek Akhmedov, Fri 9:55 AM. 1/6/23
 */
public class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        int icecreams = 0;

        int m = costs[0];
        for (int cost : costs) {
            m = Math.max(m, cost);
        }

        int[] costsFrequency = new int[m + 1];
        for (int cost : costs) {
            costsFrequency[cost]++;
        }

        for (int cost = 1; cost <= m; ++cost) {
            if (costsFrequency[cost] == 0) {
                continue;
            }
            if (coins < cost) {
                break;
            }
            int count = Math.min(costsFrequency[cost], coins / cost);
            coins -= cost * count;
            icecreams += count;
        }

        return icecreams;
    }

}
