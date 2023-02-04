package leetcode;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Dush 14:03. 12/12/22
 */
public class Solution145 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (Objects.isNull(root)) return list;
        addList(root);
        return list;
    }

    private void addList(TreeNode root) {
        list.add(0, root.val);

        if (Objects.nonNull(root.right)) addList(root.right);
        if (Objects.nonNull(root.left)) addList(root.left);
    }
}
