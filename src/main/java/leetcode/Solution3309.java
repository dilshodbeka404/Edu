package leetcode;

import java.util.Arrays;

public class Solution3309 {
    public static void main(String[] args) {
        System.out.println("maxGoodNumber = " + maxGoodNumber(new int[]{2,8,16}));
    }

    public static int maxGoodNumber(int[] nums) {
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(integers, (a, b) -> {
            String binA = Integer.toBinaryString(a);
            String binB = Integer.toBinaryString(b);
            return (binB + binA).compareTo(binA + binB);
        });

        StringBuilder max = new StringBuilder();
        for (int n : integers) {
            max.append(Integer.toBinaryString(n));
        }
        return Integer.parseInt(max.toString(), 2);
    }
}
