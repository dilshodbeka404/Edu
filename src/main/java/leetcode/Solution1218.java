package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1218 {

    //    arr = [1,2,3,4],              difference = 1
    //    arr = [1,5,7,8,5,3,4,2,1],    difference = -2
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int a : arr) {
            if (map.containsKey(a - difference)) {
                map.put(a, map.get(a - difference) + 1);
            } else {
                map.put(a, 1);
            }
            max = Math.max(max, map.get(a));
        }
        return max;
    }
}
