package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 14:44. 18/11/22
 */
public class Solution169 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int element = majorityElement(nums);
        System.out.println("element = " + element);
    }


    public static int majorityElement(int[] nums) {
        int count = 0, res = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            if (num != res) {
                count--;
            } else {
                count++;
            }
        }
        return res;
    }
//    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> majorityNums = new HashMap<>();
//        for (int num : nums) {
//            Integer mapElement = majorityNums.get(num);
//            if (Objects.isNull(mapElement)) {
//                majorityNums.put(num, 1);
//            } else {
//                majorityNums.put(num, mapElement + 1);
//            }
//        }
//
//        int max = 0;
//        int result = 0;
//        for (Map.Entry<Integer, Integer> integerIntegerEntry : majorityNums.entrySet()) {
//            if (integerIntegerEntry.getValue() > max) {
//                max = integerIntegerEntry.getValue();
//                result = integerIntegerEntry.getKey();
//            }
//        }
//
//        return result;
//    }


}
