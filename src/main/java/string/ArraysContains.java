package string;

import java.util.Arrays;

public class ArraysContains {
    public static void main(String[] args) {
        System.out.println("result = " +  !Arrays.asList("smartposprod", "ctoadmin", "smartpayadmin21").contains("userLogin"));
        System.out.println("result = " +  !Arrays.asList("smartposprod", "ctoadmin", "smartpayadmin21").contains("ctoadmin"));
        System.out.println("result = " +  !Arrays.asList("smartposprod", "ctoadmin", "smartpayadmin21").contains(null));
    }
}
