package leetcode;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Dush 09:34. 12/12/22
 */
public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        checkAndAddNode(root1, list1);
        checkAndAddNode(root2, list2);
        if (list2.size() != list1.size()) return false;
        for (int i = 0; i < list2.size(); i++) {
            if (!Objects.equals(list2.get(i), list1.get(i))) return false;
        }
        return true;
    }

    private void checkAndAddNode(TreeNode root, List<Integer> list) {
        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            list.add(root.val);
        }
        if (Objects.nonNull(root.right)) checkAndAddNode(root.right, list);
        if (Objects.nonNull(root.left)) checkAndAddNode(root.left, list);
    }
}
