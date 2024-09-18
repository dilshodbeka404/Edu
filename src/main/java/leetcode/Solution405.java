package leetcode;

/**
 * @author Dilshodbek Akhmedov, Dush 11:04. 28/11/22
 */
public class Solution405 {

    char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String toHex(int num) {
        return Integer.toHexString(num);
    }

    public String toHex2(int num) {
        if (num == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.insert(0, map[(num & 15)]);
            num = (num >>> 4);
        }
        return result.toString();
    }


    public String toHex1(int num) {
        if (num < 10) return num + "";
        StringBuilder sb = new StringBuilder();
        while (num >= 1) {
            int val = num % 16;
            if (val > 9) sb.insert(0, getVal(val));
            else sb.insert(0, val);
            num = num / 16;
        }
        return sb.toString();
    }

    private String getVal(int i) {
        String res = "";
        switch (i) {
            case 10:
                res = "a";
                break;

            case 11:
                res = "b";
                break;

            case 12:
                res = "c";
                break;

            case 13:
                res = "d";
                break;

            case 14:
                res = "e";
                break;

            case 15:
                res = "f";
                break;

        }
        return res;
    }
}


