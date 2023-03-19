package leetcode;

import leetcode.models.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dilshodbek Akhmedov, Tue 12:12 PM. 1/17/23
 */
public class Solution653 {

    public static void main(String[] args) {
        System.out.println(findTarget(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 9));
    }

    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return dfs(root, set, k);
    }

    public static boolean dfs(TreeNode root, Set<Integer> set, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return dfs(root.left, set, k) || dfs(root.right, set, k);
    }



//    Map<Integer, Integer> map = new HashMap<>();
//    public boolean findTarget(TreeNode root, int k) {
//        if (Objects.isNull(root)) return false;
//        return equalsLeafs(root.left, root.right, k);
//    }
//
//    private boolean equalsLeafs(TreeNode left, TreeNode right, int k) {
//        if (Objects.isNull(left) || Objects.isNull(right)) return false;
//        else {
//            if (left.val + right.val == k || left.val == k || right.val == k) return true;
//            else {
//                return equalsLeafs(left.left, left.right, k) || equalsLeafs(right.left, right.right, k);
//            }
//        }
//    }
}
