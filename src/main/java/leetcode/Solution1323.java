package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Pay 14:07. 10/11/22
 */
public class Solution1323 {
    public static void main(String[] args) {
        maximum69Number2(9669);
    }

    public int maximum69Number(int num) {
        String val = num + "";
        return Integer.parseInt(val.replaceFirst("6", "9"));
    }

    public static int maximum69Number2(int num) {
        List<Integer> numList = new ArrayList<>();
        while (num > 0) {
            numList.add(0, num % 10);
            num /= 10;
        }
        int result = 0;
        boolean find = false;
        for (Integer i : numList) {
            if (!find && i == 6) {
                result = result * 10 + 9;
                find = true;
            }
            else {
                result = result * 10 + i;
            }
        }
        return result;
    }
}
