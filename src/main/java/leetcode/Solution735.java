package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution735 {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> collision = new Stack<>();
        List<Integer> tmp = new ArrayList<>();

        for (int asteroid : asteroids) {
            if (asteroid < 0) {
                if (collision.isEmpty()) {
                    collision.push(asteroid);
                } else {
                    boolean isBreak = false;
                    while (!collision.isEmpty()) {
                        int element = collision.pop();
                        if (element < 0) {
                            tmp.add(0, element);
                        } else if (element > 0 && (element + asteroid) > 0) {
                            tmp.add(0, element);
                            isBreak = true;
                            break;
                        } else if (element + asteroid == 0) {
                            isBreak = true;
                            break;
                        }
                    }
                    collision.addAll(tmp);
                    tmp.clear();
                    if (!isBreak) {
                        collision.push(asteroid);
                    }
                }
            } else {
                collision.push(asteroid);
            }
        }

        return collision.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] asteroidCollision1(int[] asteroids) {
        int top = -1;
        for (int element : asteroids) {
            boolean stillAlive = true;
            while (stillAlive && element < 0 && top >= 0 && asteroids[top] > 0) {
                stillAlive = asteroids[top] + element < 0;
                if (asteroids[top] + element <= 0) top--;
            }
            if (stillAlive) asteroids[++top] = element;
        }
        return Arrays.copyOf(asteroids, top + 1);
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        asteroidCollision(new int[]{-2, 1, 1, -1});
        System.out.println("time  = " + (System.nanoTime() - start));
    }
}
