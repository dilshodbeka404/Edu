package leetcode;

public class Solution1963 {

    public static void main(String[] args) {
//        System.out.println("minSwaps = " + minSwaps("][]["));
        try {
            System.out.println("minSwaps = " + 1);
//            throw new RuntimeException("");
        } catch (Exception e) {
            System.out.println("minSwaps = " + 2);
        } finally {
            System.out.println("minSwaps = " + 3);
        }
    }

    public static int minSwaps(String s) {
        int stackSize = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stackSize++;
            } else if (stackSize > 0) {
                stackSize--;
            }
        }

        return (stackSize + 1) / 2;
    }
}
