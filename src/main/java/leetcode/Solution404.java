package leetcode;

import leetcode.models.TreeNode;

/**
 * @author Dilshodbek Akhmedov, Dush 10:52. 28/11/22
 */
public class Solution404 {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
            else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
