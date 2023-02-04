package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dilshodbek Akhmedov, Chor 11:54. 30/11/22
 */
public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> count = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int k : arr) {
            if (!visited.contains(k)) {
                visited.add(k);
                int repetitons = 0;

                for (int i : arr)
                    if (k == i)
                        repetitons++;

                if (!count.contains(repetitons))
                    count.add(repetitons);
                else return false;
            }
        }
        return true;
    }

//    public boolean uniqueOccurrences(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int a : arr)
//            map.put(a, map.getOrDefault(a, 0) + 1);
//        return map.size() == new HashSet<>(map.values()).size();
//    }


}
