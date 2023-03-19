package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        List<Integer> box = new ArrayList<>();
        box.add(1);
        result.add(box);
        if (numRows == 1) return result;

        for (int i = 1; i < numRows; i++) {
            List<Integer> boxTwo = new ArrayList<>(i);
            boxTwo.add(1);
            for (int j = 1; j < i; j++) {
                boxTwo.add(box.get(j) + box.get(j - 1));
            }
            boxTwo.add(1);
            result.add(boxTwo);
            box = boxTwo;
        }
        return result;
    }
}
