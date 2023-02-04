package leetcode;

/**
 * @author Dilshodbek Akhmedov, Sesh 10:48. 29/11/22
 */
public class Solution415 {
    public String addStringss(String num1, String num2) {
        int tmp = 0;
        StringBuilder result = new StringBuilder();
        int i1 = num1.length();
        int j1 = num2.length();
        for (int i = i1 - 1, j = j1 - 1; i >= 0 && j >= 0; i--, j--) {
            int a = num1.charAt(i) - 48, b = num2.charAt(j) - 48;
            tmp = tmp + a + b;
            result.insert(0, tmp % 10 != 0 ? tmp % 10 : "");
            tmp = tmp / 10;
        }

        if (i1 == j1) {
            result.insert(0, tmp);
        } else if (i1 > j1) {
            int index = i1 - j1 - 1;
            result.insert(0, num1.charAt(index) - 48 + tmp);
            if (index > 0) {
                result.insert(0, num1.substring(0, index));
            }
        } else {
            int index = j1 - i1 - 1;
            result.insert(0, num2.charAt(index) - 48 + tmp);
            if (index > 0) {
                result.insert(0, num2.substring(0, index));
            }
        }
        tmp = Integer.parseInt(result.toString());
        return tmp + "";
    }

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int answer = 0;
        while (i >= 0 || j >= 0 || answer != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + answer;
            result.insert(0, sum % 10);
            answer = sum / 10;
            i--;
            j--;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        char a = '9';
        System.out.println("a = " + a);
        System.out.println("args = " + ((int) a - 48));
    }
}
