package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dilshodbek Akhmedov, Chor 16:20. 23/11/22
 */
public class Solution345 {
    public String reverseVowels1(String s) {
        if (s.length() < 2) return s;
        List<Character> keys = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i <= j; i++) {
            if (keys.contains(chars[i])) {
                for (int k = j; k >= i; k--) {
                    if (keys.contains(chars[k])) {
                        char tmp = chars[i];
                        chars[i] = chars[k];
                        chars[k] = tmp;
                        j = k - 1;
                        break;
                    }
                    if (k == chars.length / 2) i = k + 1;
                }
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        char[] c = new char[]{'J', 'E', 'V', 'A'};
        String s = String.valueOf(c);
        System.out.println("s = " + s);
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j) {
                if (contains(arr[i])) break;
                i++;
            }
            while (j > i) {
                if (contains(arr[j])) break;
                j--;
            }
            if (i >= j) return String.valueOf(arr);
            swap(arr, i, j);
            i++;
            j--;
        }
        return String.valueOf(arr);
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean contains(char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < 10; i++) {
            if (c == vowels[i]) return true;
        }
        return false;
    }
}

