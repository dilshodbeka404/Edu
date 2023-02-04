package leetcode;

import leetcode.models.TreeNode;

import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Tue 11:59 AM. 1/17/23
 */
public class Solution98 {
//    public boolean isValidBST(TreeNode tree) {
//        if (tree == null) return true;
//        if (Objects.nonNull(tree.left) && Objects.nonNull(tree.right)) {
//            if (tree.val > tree.left.val && tree.val < tree.right.val) {
//                return isValidBST(tree.left) && isValidBST(tree.right);
//            } else return false;
//        } else if (Objects.nonNull(tree.left)) {
//            if (tree.val > tree.left.val) {
//                return isValidBST(tree.left);
//            } else return false;
//        } else if (Objects.nonNull(tree.right)) {
//            if (tree.val < tree.right.val) {
//                return isValidBST(tree.right);
//            } else return false;
//        }
//        return true;
//    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
