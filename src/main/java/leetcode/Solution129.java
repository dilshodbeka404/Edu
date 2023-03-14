package leetcode;

import leetcode.models.TreeNode;

public class Solution129 {
    public static void main(String[] args) {

    }

    int sum = 0;

//    public int sumNumbers(TreeNode root) {
//        return sumNumbers(root, 0);
//    }
//
//    public int sumNumbers(TreeNode root, int val) {
//        if (root != null) {
//            val = val * 10 + root.val;
//            sumNumbers(root.left, val);
//            sumNumbers(root.right, val);
//        } else {
//            sum += val;
//        }
//        return sum;
//    }


    public int sumNumbers(TreeNode root) {
        sumNumbers(root, 0);
        return sum;
    }

    void sumNumbers(TreeNode root, int num) {
        if (root == null) {
            return;
        }
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum = sum + num;
            return;
        }
        sumNumbers(root.left, num);
        sumNumbers(root.right, num);
    }
}
