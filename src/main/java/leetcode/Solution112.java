package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Sat 4:32 PM. 12/31/22
 */
public class Solution112 {

    boolean result;

    public boolean hasPathSum(TreeNode root, int targetSum) {

        result = false;
        traverseBT(root, 0, targetSum);
        return result;
    }

    private void traverseBT(TreeNode node, int sum, int targetSum) {
        if (node == null) return;

        sum += node.val;

        if (node.left == null && node.right == null && sum == targetSum) {
            result = true;
            return;
        }
        traverseBT(node.left, sum, targetSum);
        traverseBT(node.right, sum, targetSum);
    }
}
