package leetcode;

/**
 * @author Dilshodbek Akhmedov, Jum 12:31. 11/11/22
 */
public class Solution26 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int a = removeDuplicates(arr);
        System.out.println("a = " + a);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1])
                nums[k++] = nums[i];
        }
        return k;
    }
}
