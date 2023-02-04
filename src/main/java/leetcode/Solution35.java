package leetcode;

/**
 * @author Dilshodbek Akhmedov, Wed 17:38. 21/09/22
 */
public class Solution35 {
//    public static void main(String[] args) {
//        int[] a = new int[5];
//        for (int i = 0; i < a.length; i++) System.out.println("a[i] = " + a[i]);
//    }

    public static int searchInsert(int[] nums, int target) {
        int a = 10000;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (a > Math.abs(nums[i] - target)) {
                a = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ")).length();
    }

//    public int[] plusOne(int[] digits) {
//        if (digits[digits.length - 1] != 9) {
//            digits[digits.length - 1] = digits[digits.length - 1] + 1;
//            return digits;
//        }
//
//        int[] new_digits = new int[digits.length + 1];
//        for (int i = digits.length - 1; 0 <= i; i--) {
//            if (digits[i] == 9) digits[i] = 0;
//            else {
//                digits[i] = digits[i] + 1;
//                return digits;
//            }
//        }
//        new_digits[0] = 1;
//        return new_digits;
//    }

    public int[] plusOne(int[] digits) {
        return plusOneRecursive(digits, digits.length);
    }

    private int[] plusOneRecursive(int[] digits, int length) {
        if (digits[length - 1] != 9) {
            digits[length - 1] = digits[length - 1] + 1;
            return digits;
        }
        digits[length - 1] = 0;
        if (length - 1 == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return plusOneRecursive(digits, length - 1);
    }


    public String reverseWords(String s) {
        StringBuilder returnText = new StringBuilder();
        String[] strings = s.split(" ");
        for (String string : strings) {
            StringBuilder newString = new StringBuilder(string);
            newString.reverse();
            returnText.append(newString).append(" ");
        }
        return returnText.substring(0, returnText.length() - 1);
    }

    public static void main(String[] args) {
        String s = addBinary("101", "1");
        System.out.println("args = " + s);
    }

    public static String addBinaries(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int lengthA = charsA.length - 1;
        int lengthB = charsB.length - 1;
        int length = Math.max(lengthA, lengthB);
        int memory = 0;
        StringBuilder result = new StringBuilder();
        for (int i = length; 0 <= i; i--) {
            if (lengthA >= 0) {
                if (charsA[lengthA] == '1') memory++;
                lengthA--;
            }
            if (lengthB >= 0) {
                if (charsB[lengthB] == '1') memory++;
                lengthB--;
            }
            if (memory == 3) {
                result.append(1);
                memory = 1;
            } else if (memory == 2) {
                result.append(0);
                memory = 1;
            } else if (memory == 1) {
                result.append(1);
                memory = 0;
            } else {
                result.append(0);
                memory = 0;
            }
        }
        if (memory == 1) result.append(1);
        return result.reverse().toString();
    }

    public static String addBinary(String a, String b) {
        char[] s = new char[Integer.max(a.length(), b.length()) + 1];
        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1, k = s.length - 1; i >= 0 || j >= 0; i--, j--, k--) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            switch (sum) {
                case 0:
                    carry = 0;
                    s[k] = '0';
                    break;
                case 1:
                    carry = 0;
                    s[k] = '1';
                    break;
                case 2:
                    carry = 1;
                    s[k] = '0';
                    break;
                case 3:
                    carry = 1;
                    s[k] = '1';
                    break;
                default:
                    break;
            }
        }
        if (carry == 0) {
            return new String(s, 1, s.length - 1);
        } else {
            s[0] = '1';
            return new String(s, 0, s.length);
        }
    }
}

