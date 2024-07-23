package leetcode;

public class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");

        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {

            int num1 = i < nums1.length ? Integer.parseInt(nums1[i]) : 0;
            int num2 = i < nums2.length ? Integer.parseInt(nums2[i]) : 0;

            if (num1 < num2) {
                return -1;
            }

            if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }
}
