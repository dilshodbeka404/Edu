package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Tue 9:44 AM. 1/10/23
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
