package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Tue 3:28 PM. 1/17/23
 */
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else
            return root;
    }
}
