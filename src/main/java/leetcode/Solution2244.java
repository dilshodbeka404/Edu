package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Wed 10:00 AM. 1/4/23
 */
public class Solution2244 {
    public int minimumRoundsw(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        // Store the frequencies in the map.
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        int minimumRounds = 0;
        // Iterate over the task's frequencies.
        for (int count : freq.values()) {
            // If the frequency is 1, it's not possible to complete tasks.
            if (count == 1) {
                return -1;
            }

            if (count % 3 == 0) {
                // Group all the task in triplets.
                minimumRounds += count / 3;
            } else {
                // If count % 3 = 1; (count / 3 - 1) groups of triplets and 2 pairs.
                // If count % 3 = 2; (count / 3) groups of triplets and 1 pair.
                minimumRounds += count / 3 + 1;
            }
        }

        return minimumRounds;
    }

    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        int minimumRounds = 0;
        for (int count : freq.values()) {
            if (count == 1) return -1;

            if (count % 3 == 0)
                minimumRounds += count / 3;
            else
                minimumRounds += count / 3 + 1;
        }

        return minimumRounds;
    }

    public int minimumRounds1(int[] tasks) {
        Arrays.sort(tasks);
        int res = 0;
        for (int i = 0; i < tasks.length;) {
            int j = i + 1;
            while (j < tasks.length && tasks[j] == tasks[i]) j++;
            if (j == i + 1) return -1;
            res += compute(j - i);
            i = j;
        }
        return res;
    }

    private int compute(int i) {
        if (i % 3 == 0) return i / 3;
        if (i % 3 == 2) return (i - 2) / 3 + 1;
        return (i - 4) / 3 + 2;
    }
}
