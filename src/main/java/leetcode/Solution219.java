package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Shan 16:38. 19/11/22
 */
public class Solution219 {
    //    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> numbers = new HashMap<>(nums.length);
//        for (int i = 0; i < nums.length; i++) {
//            Integer target = numbers.get(nums[i]);
//            if (Objects.nonNull(target) && Math.abs(target - i) <= k) {
//                return true;
//            } else numbers.put(nums[i], i);
//        }
//        return false;
//    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        Integer index;
        for (int i = 0; i < nums.length; i++) {
            index = map.put(nums[i], i);
            if (index != null && Math.abs(index - i) <= k) return true;
        }
        return false;
    }


}
