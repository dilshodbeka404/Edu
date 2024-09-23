package leetcode;

import leetcode.models.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution2583 {
    public static void main(String[] args) {

    }
    Map<Integer, Long> levelSumMap = new HashMap<>();

    public long kthLargestLevelSum(TreeNode root, int k) {
        levelSumMap.put(1, (long) root.val);
        recursiveGenerator(root, 2);

        List<Long> list = levelSumMap.values().stream().sorted().collect(Collectors.toList());

        if (list.size() >= k)
            return list.get(list.size() - k);
        else
            return -1;
    }

    private void recursiveGenerator(TreeNode root, int level) {
        if (root.left != null) {
            calculateTreeLevelSum(root.left, level);
        }
        if (root.right != null) {
            calculateTreeLevelSum(root.right, level);
        }
    }

    private void calculateTreeLevelSum(TreeNode node, int level) {
        levelSumMap.put(level, levelSumMap.getOrDefault(level, 0L) + node.val);
        recursiveGenerator(node, level + 1);
    }
}
