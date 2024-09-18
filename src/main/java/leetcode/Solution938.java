package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Chor 09:56. 07/12/22
 */
public class Solution938 {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        setSum(root.val, low, high);
        if (root.left != null) {
            rangeSumBST(root.left, low, high);
        }
        if (root.right != null) {
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }

    void setSum(int num, int low, int high) {
        if (num >= low && num <= high) sum = sum + num;
    }
}
