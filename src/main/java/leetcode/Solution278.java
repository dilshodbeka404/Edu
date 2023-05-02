package leetcode;

public class Solution278 {
//    public int firstBadVersion(int n) {
//        return search(0, n);
//    }

    private int search(int min, int max) {
        int target = (min + max) / 2 + 1;
        if (isBadVersion(target)) {
            if (!isBadVersion(target - 1)) {
                return target;
            }
            max = target;
        } else {
            if (isBadVersion(target - 1)) {
                return target;
            }
            min = target;
        }
        return search(min, max);
    }

    public boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int max) {
        int min = 1;
        while (min <= max) {
            int target = min + (max - min) / 2;
            if (isBadVersion(target)) {
                max = target - 1;
            } else {
                min = target + 1;
            }
        }
        return min;
    }
}
