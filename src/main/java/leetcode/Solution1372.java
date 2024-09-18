package leetcode;

import leetcode.models.TreeNode;

public class Solution1372 {

    int longestPath = 0;

    public int longestZigZag(TreeNode root) {
        helper(root);
        return longestPath;
    }

    public int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{-1, -1};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] answer = new int[]{left[1] + 1, right[0] + 1};
        longestPath = Math.max(longestPath, Math.max(answer[0], answer[1]));
        return answer;
    }

//    int maxCount = 0;
//
//    public int longestZigZag(TreeNode root) {
//
//        longestCountingLeft(root, 0);
//        longestCountingRigth(root, 0);
//        return maxCount;
//    }
//
//    public void longestCountingLeft(TreeNode node, int count) {
//        if (node != null && node.left != null) {
//            count++;
//
//            if (maxCount < count) maxCount = count;
//            longestCountingRigth(node.right, count);
//            longestCountingRigth(node.left, 0);
//        }
//    }
//
//    public void longestCountingRigth(TreeNode node, int count) {
//        if (node != null && node.right != null) {
//            count++;
//
//            if (maxCount < count) maxCount = count;
//            longestCountingLeft(node.left, count);
//            longestCountingLeft(node.right, 0);
//        }
//    }

}
