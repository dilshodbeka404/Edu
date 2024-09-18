package leetcode;

import java.util.Arrays;

/**
 * @author Dilshodbek Akhmedov, Jum 08:53. 25/11/22
 */
public class Solution349 {
//    public int[] intersection(int[] nums1, int[] nums2) {
//        Map<Integer, Integer> box1 = setMap(nums1);
//        Map<Integer, Integer> box2 = setMap(nums1);
//
//        int[] common = new int[Math.min(nums1.length, nums2.length)];
//        int found = 0;
//
//        for (Map.Entry<Integer, Integer> entry : box2.entrySet()) {
//            Integer tmpVal = box1.get(entry.getKey());
//            if (Objects.nonNull(tmpVal)) {
//                for (int i = 0; i < Math.min(tmpVal, entry.getValue()); i++) {
//                    common[found++] = entry.getKey();
//                }
//            }
//
//        }
//        return Arrays.copyOf(common, found);
//    }
//
//    private Map<Integer, Integer> setMap(int[] nums) {
//        Map<Integer, Integer> box = new HashMap<>();
//        for (int i : nums) {
//            Integer val = box.get(i);
//            if (Objects.nonNull(val)) {
//                box.put(i, val + 1);
//            }
//            box.put(i, 1);
//        }
//        return box;
//    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        int[] res = new int[1001];
        int count = 0;
        for (int i : nums1) {
            map[i]++;
        }
        for (int i : nums2) {
            if (map[i] > 0) {
                res[count++] = i;
                map[i]--;
            }
        }
        return Arrays.copyOfRange(res, 0, count);
    }

}
