package leetcode;

import leetcode.models.TreeNode;

import java.util.Objects;

/**
 * @author Dilshodbek Akhmedov, Sesh 10:07. 15/11/22
 */
public class Solution222 {
    public static void main(String[] args) {

    }

    int count = 0;

    public int countNodes(TreeNode root) {
        countingLeftNode(root.left);
        countingRightNode(root.left);
        return count;
    }

    public void countingLeftNode(TreeNode root) {
        while (Objects.nonNull(root)) {
            count++;
            root = root.left;
            if (Objects.nonNull(root.right)){
                countingRightNode(root.right);
            }
        }
    }

    public void countingRightNode(TreeNode root) {
        while (Objects.nonNull(root)) {
            count++;
            root = root.right;
            if (Objects.nonNull(root.left)){
                countingLeftNode(root.left);
            }
        }
    }

}
