package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1291 {

    /**
     * low = 10 to high = 1000000000
     */

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> results = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789);
        List<Integer> response = new ArrayList<>();
        for (Integer result : results) {
            if (result >= low && result <= high) response.add(result);
        }
        results.sort(Integer::compareTo);
        return response;
    }

    public List<Integer> sequentialDigits2(int low, int high) {
        List<Integer> response = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    response.add(num);
                }
                nextDigit++;
            }
        }

        response.sort(Integer::compareTo);
        return response;
    }
}
