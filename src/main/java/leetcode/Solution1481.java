package leetcode;

import java.util.*;

public class Solution1481 {

    public static void main(String[] args) {
        findLeastNumOfUniqueInts2(new int[]{5, 5, 1}, 1);
    }


    public static int findLeastNumOfUniqueInts2(int[] arr, int k) {
        // Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Convert the frequencies to a list
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());

        // Sort the frequencies in ascending order
        Collections.sort(frequencies);

        // Remove the least frequent numbers until k elements are removed
        int uniqueCount = frequencies.size();
        int removedCount = 0;
        for (int freq : frequencies) {
            if (removedCount + freq <= k) {
                // If we can remove all occurrences of this number
                removedCount += freq;
                uniqueCount--;
            } else {
                // Otherwise, break the loop
                break;
            }
        }

        return uniqueCount;
    }

}
