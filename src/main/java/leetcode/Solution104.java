package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Fri 10:44 AM. 12/30/22
 */
public class Solution104 {
    int max = 0;

    public int maxDepth(TreeNode root) {
        int count = 0;
        counting(root, count);
        return max;
    }

    private void counting(TreeNode tree, int count) {
        if (tree != null) {
            count++;

            counting(tree.left, count);
            counting(tree.right, count);
        } else {
            if (max < count) max = count;
        }
    }
}
