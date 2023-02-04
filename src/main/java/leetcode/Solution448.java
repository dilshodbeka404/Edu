package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Dush 18:20. 21/11/22
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        int[] temp = new int[nums.length];
        for (int num : nums) {
            temp[num] = num;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) numbers.add(i);
        }
        return numbers;
    }

//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> numbers = new ArrayList<>(nums.length);
//        for (int i = 1; i <= nums.length; i++) {
//            numbers.add(i);
//        }
//        for (int num : nums) {
//            numbers.remove(Integer.valueOf(num));
//        }
//        return numbers;
//    }
}
