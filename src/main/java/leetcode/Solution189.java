package leetcode;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length <= k) return;

        int i = 0;
        int[] tmp = new int[nums.length - k];

        System.arraycopy(nums, 0, tmp, 0, tmp.length);
        for (int j = tmp.length; j < nums.length; j++) {
            nums[i++] = nums[j];
        }
        for (int num : tmp) {
            nums[i++] = num;
        }
    }

    public void rotates(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length <= k) return;

        // Reverse the first part of the array
        reverse(nums, 0, nums.length - k - 1);

        // Reverse the second part of the array
        reverse(nums, nums.length - k, nums.length - 1);

        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
