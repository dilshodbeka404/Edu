package leetcode;

public class Solution80 {

    public static void main(String[] args) {
        removeDuplicates3(new int[] {1,1,1,2,2,3});
    }

    public int removeDuplicate(int[] nums) {
        int tmp = nums[0];
        int count = 1;
        boolean first = true;

        for (int i = 1; i < nums.length; i++) {
            if (first && tmp == nums[i]) {
                count++;
                first = false;
            } else if (tmp != nums[i]) {
                count++;
                first = true;
            }
        }
        return count;
    }

    public int removeDuplicate2(int[] nums) {
        int l = nums.length;
        int[] temps = new int[l];

        int tmp = 0;
        for (int num : nums) {
            if (num >= l) {
                temps[num - 1] = num;
                tmp = num;
            }
        }
        return tmp;
    }

    public static int removeDuplicates3(int[] nums) {
        int val = nums[0];
        int count = 1;
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val && count != 2) {
                nums[k++] = nums[i];
                count++;
            } else if (nums[i] != val) {
                val = nums[i];
                nums[k++] = val;
                count = 1;
            }
        }

        return k;
    }

}
