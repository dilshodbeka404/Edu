package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Dush 11:27. 28/11/22
 */
public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                stringList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                stringList.add("Fizz");
            } else if (i % 5 == 0) {
                stringList.add("Buzz");
            } else stringList.add(i + "");
        }
        return stringList;
    }
}
