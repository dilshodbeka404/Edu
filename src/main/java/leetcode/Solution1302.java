package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Wed 4:34 PM. 1/4/23
 */
public class Solution1302 {
    int level = 0;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return sum;
        calculatingDeepest(root, level);
        return sum;
    }

    private void calculatingDeepest(TreeNode node, int count) {
        count++;
        if (node.left == null && node.right == null) {
            if (level < count) {
                level = count;
                sum = node.val;
            } else if (level == count) {
                sum += node.val;
            }
        } else {
            if (node.left != null) calculatingDeepest(node.left, count);
            if (node.right != null) calculatingDeepest(node.right, count);
        }
    }
}
