package leetcode;

import java.util.HashMap;

/**
 * @author Dilshodbek Akhmedov, Thu 16:24. 15/09/22
 */
public class Solution13 {
    public static void main(String[] args) {
        String s = "MCLXIV";
        System.out.println(getNum(s));
        System.out.println(getLeetCodeNum(s));
    }

    private static Integer getNum(String s) {
        HashMap<Character, Integer> map = getRomaMap();

        int sum = 0;
        int state = 0;
        char[] chars = s.toCharArray();

        if (chars.length == 0) return 0;
        if (chars.length == 1) return map.get(chars[0]);

        for (char aChar : chars) {
            Integer n = map.get(aChar);
            if (state < n)
                sum = sum + n - 2 * state;
            else
                sum += n;
            state = n;
        }
        return sum;
    }
    
    private static Integer getLeetCodeNum(String s) {
        HashMap<Character, Integer> map = getRomaMap();
        Integer result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    public static HashMap<Character, Integer> getRomaMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
