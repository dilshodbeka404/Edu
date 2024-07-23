package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution1636 {

    public int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(new Pair(entry.getKey(), entry.getValue()));
        }

        int idx = 0;
        while (!priorityQueue.isEmpty()) {
            Pair pair = priorityQueue.remove();
            for (int i = 0; i < pair.freq; i++) {
                res[idx] = pair.val;
                idx++;
            }
        }

        return res;
    }

    static class Pair implements Comparable<Pair> {
        int val;
        int freq;

        Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair pair) {
            if (this.freq == pair.freq) {
                return pair.val - this.val;
            }
            return this.freq - pair.freq;
        }
    }
}
