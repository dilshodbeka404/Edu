package leetcode;

import leetcode.models.TreeNode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution1161 {
    public int maxLevelSums(TreeNode root) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        goDFS(root, 1, map);

        int lvlMax = 0;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            Integer lvl = entry.getKey();
            Integer sum = entry.getValue();
            if (max < sum) {
                max = sum;
                lvlMax = lvl;
            }
        }
        return lvlMax;
    }

    private void goDFS(TreeNode node, int lvl, Map<Integer, Integer> map) {
        if (node == null) return;

        int sum = map.computeIfAbsent(lvl, k -> 0);
        sum += node.val;
        map.put(lvl, sum);
        lvl++;
        goDFS(node.left, lvl, map);
        goDFS(node.right, lvl, map);
    }

}
