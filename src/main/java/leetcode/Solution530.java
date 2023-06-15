package leetcode;

import leetcode.models.TreeNode;

public class Solution530 {

    int min = Integer.MAX_VALUE;

    public int getMinimumDifferencej(TreeNode root) {
        if (root != null) {
            searchMinimumDifference(root.left, root.val);
            searchMinimumDifference(root.right, root.val);
        }
        return min;
    }

    private void searchMinimumDifference(TreeNode head, int num) {
        if (head != null) {
            equalMinValue(head.val, num);
            searchMinimumDifference(head.left, head.val);
            searchMinimumDifference(head.right, head.val);
        }
    }

    private void equalMinValue(int val, int num) {
        int tmp = Math.abs(val - num);
        if (tmp < min) min = tmp;
    }


    Integer preValue = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;

        getMinimumDifference(root.left);

        if (preValue != null) min = Math.min(min, root.val - preValue);

        preValue = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}
