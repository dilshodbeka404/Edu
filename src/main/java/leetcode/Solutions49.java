package leetcode;

import java.util.*;

public class Solutions49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> list = anagramsMap.getOrDefault(key, new ArrayList<>());
            list.add(str);
            anagramsMap.put(key, list);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
