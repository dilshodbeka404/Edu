package leetcode;

import java.util.*;

public class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> boxSetOne = new HashSet<>();
        Set<Integer> boxSetTwo = new HashSet<>();

        Arrays.stream(nums1).forEach(boxSetOne::add);
        Arrays.stream(nums2).forEach(boxSetTwo::add);

        Set<Integer> cashSet = new HashSet<>(boxSetOne);
        boxSetOne.removeAll(boxSetTwo);
        boxSetTwo.removeAll(cashSet);

        return Arrays.asList(new ArrayList<>(boxSetOne), new ArrayList<>(boxSetTwo));
    }
}
