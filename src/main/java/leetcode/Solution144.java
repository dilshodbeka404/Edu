package leetcode;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Fri 9:17 AM. 12/30/22
 */
public class Solution144 {

    List<Integer> integers = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return integers;
        integers.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return integers;
    }
}
