package leetcode;

import java.util.PriorityQueue;

public class Solution703 {

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));   // return 4
        System.out.println(kthLargest.add(5));   // return 5
        System.out.println(kthLargest.add(10));  // return 5
        System.out.println(kthLargest.add(9));   // return 8
        System.out.println(kthLargest.add(4));   // return 8

    }

    static class KthLargest {
        private PriorityQueue<Integer> heap = new PriorityQueue<>();
        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (var n : nums) add(n);
        }

        public int add(int val) {
            heap.offer(val);
            if (heap.size() > k) heap.poll();
            return heap.peek();
        }
    }
}
