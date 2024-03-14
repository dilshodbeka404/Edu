package leetcode;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1609 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(3);
//        treeNode.left.left.left = new TreeNode(12);
//        treeNode.left.left.right = new TreeNode(8);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(7);
//        treeNode.right.right = new TreeNode(9);
//        treeNode.right.left.left = new TreeNode(6);
//        treeNode.right.right.right = new TreeNode(2);

        System.out.println("isEvenOddTree(treeNode) = " + isEvenOddTree(treeNode));

    }

    static Map<Integer, List<Integer>> oddTreeMap = new HashMap<>();


    private static void runningTree(TreeNode node, int level) {
        if (node != null) {
            List<Integer> list = oddTreeMap.getOrDefault(level, new ArrayList<>());
            list.add(node.val);
            oddTreeMap.put(level, list);
            if (node.left != null) runningTree(node.left, level + 1);
            if (node.right != null) runningTree(node.right, level + 1);
        }
    }


    public static boolean isEvenOddTree(TreeNode root) {
        runningTree(root, 0);
        for (Map.Entry<Integer, List<Integer>> entry : oddTreeMap.entrySet()) {
            List<Integer> values = entry.getValue();
            int n = values.size();
            if (entry.getKey() % 2 == 0) {
                if (values.get(0) % 2 == 0) {
                    return false;
                }
                for (int i = 1; i < n; i++) {
                    if (values.get(i) % 2 == 0 || values.get(i - 1) >= values.get(i)) {
                        return false;
                    }
                }
            } else {
                if (values.get(0) % 2 == 1) {
                    return false;
                }
                for (int i = 1; i < n; i++) {
                    if (values.get(i) % 2 == 1 || values.get(i - 1) <= values.get(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isEvenOddTree2(TreeNode root) {
        final List<TreeNode> levels = new ArrayList<>();
        levels.add(root);
        int start = 0;
        int end = 1;
        boolean evenLevel = true;
        int previous = Integer.MIN_VALUE;

        while (start != end) {
            for (int i = start; i < end; i++) {
                final TreeNode node = levels.get(i);
                int val = node.val;
                if (evenLevel) {
                    if (val % 2 == 0 || val <= previous) return false;
                } else {
                    if (val % 2 == 1 || val >= previous) return false;
                }
                previous = val;

                final TreeNode left = node.left;
                final TreeNode right = node.right;
                if (left != null) levels.add(left);
                if (right != null) levels.add(right);
            }
            start = end;
            end = levels.size();
            evenLevel = !evenLevel;
            if (evenLevel) {
                previous = Integer.MIN_VALUE;
            } else {
                previous = Integer.MAX_VALUE;
            }
        }
        return true;
    }

}
