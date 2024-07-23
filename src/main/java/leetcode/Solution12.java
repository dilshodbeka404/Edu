package leetcode;

public class Solution12 {

    public String intToRoman(int num) {
        StringBuilder romanNum = new StringBuilder();

        if (num >= 1000) {
            romanNum.append("M".repeat(num / 1000));
            num = num % 1000;
        }

        if (num >= 100) {
            int i = num / 100;
            if (i == 9) {
                romanNum.append("CM");
            } else if (i > 5) {
                romanNum.append("D");
                romanNum.append("C".repeat(i % 5));
            } else if (i == 5) {
                romanNum.append("D");
            } else if (i == 4) {
                romanNum.append("CD");
            } else {
                romanNum.append("C".repeat(i));
            }
            num = num % 100;
        }

        if (num >= 10) {
            int i = num / 10;
            if (i == 9) {
                romanNum.append("XC");
            } else if (i > 5) {
                romanNum.append("L");
                romanNum.append("X".repeat(i % 5));
            } else if (i == 5) {
                romanNum.append("L");
            } else if (i == 4) {
                romanNum.append("XL");
            } else {
                romanNum.append("X".repeat(i));
            }
            num = num % 10;
        }

        if (num == 9) {
            romanNum.append("IX");
        } else if (num > 5) {
            romanNum.append("V");
            romanNum.append("I".repeat(num % 5));
        } else if (num == 5) {
            romanNum.append("V");
        } else if (num == 4) {
            romanNum.append("IV");
        } else {
            romanNum.append("I".repeat(num));
        }

        return romanNum.toString();
    }

}
