package leetcode;

import java.util.*;

public class Solution1331 {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int n : arr) {
            map.put(n, 0);
        }

        int rank = 1;
        for (Integer key : map.keySet()) {
            map.put(key, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public int[] arrayRankTransform2(int[] arr) {
        int[] dup = arr.clone();
        Arrays.sort(dup);

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : dup) {
            map.putIfAbsent(n, map.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) { // n
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public int[] arrayRankTransform3(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
