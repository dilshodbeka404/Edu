package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Jum 11:33. 16/12/22
 */
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int target) {
        TreeNode tree = root;
        while (tree != null && tree.val != target) {
            if (target < tree.val) {
                tree = tree.left;
            } else {
                tree = tree.right;
            }
        }
        return tree;
    }
}
