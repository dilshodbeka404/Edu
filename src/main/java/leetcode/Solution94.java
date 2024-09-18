package leetcode;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Sesh 17:41. 25/10/22
 */
public class Solution94 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        List<Integer> integers = inorderTraversal(treeNode);
        System.out.println("integers = " + integers);
    }

    //    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        return inorder(list, root);
//    }
//
//    public List<Integer> inorder(List<Integer> list, TreeNode root) {
//        if (root == null) return list;
//        inorder(list, root.left);
//        list.add(root.val);
//        inorder(list, root.right);
//
//        return list;
//    }
    static List<Integer> list = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

}
