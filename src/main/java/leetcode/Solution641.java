package leetcode;

public class Solution641 {

    /**
     * Your MyCircularDeque object will be instantiated and called as such:<br/>
     * MyCircularDeque obj = new MyCircularDeque(k);<br/>
     * boolean param_1 = obj.insertFront(value);<br/>
     * boolean param_2 = obj.insertLast(value);<br/>
     * boolean param_3 = obj.deleteFront();<br/>
     * boolean param_4 = obj.deleteLast();<br/>
     * int param_5 = obj.getFront();<br/>
     * int param_6 = obj.getRear();<br/>
     * boolean param_7 = obj.isEmpty();<br/>
     * boolean param_8 = obj.isFull();<br/>
     */
    class MyCircularDeque {
        int size;
        int max;
        int front;
        int last;
        TreeNode[] circularDeque;

        public MyCircularDeque(int k) {
            this.size = 0;
            this.max = k - 1;
            this.front = 0;
            this.last = 0;
            this.circularDeque = new TreeNode[k];
        }

        public boolean insertFront(int value) {
            if (this.size == this.max) return false;

            this.circularDeque[size] = new TreeNode(null, front, value);
            this.circularDeque[front].left = this.size;
            this.front = this.size++;
            return true;
        }

        public boolean insertLast(int value) {
            if (this.size == this.max) return false;

            this.circularDeque[size] = new TreeNode(last, null, value);
            this.circularDeque[last].right = size;
            this.last = size++;
            return true;
        }

        public boolean deleteFront() {
            if (this.size == 0) return false;

            TreeNode node = this.circularDeque[this.front];
            this.circularDeque[this.front] = null;

            this.front = node.left;
            this.circularDeque[this.front].right = null;
            this.size--;

            return true;
        }

        public boolean deleteLast() {
            if (this.size == 0) return false;

            TreeNode node = this.circularDeque[this.last];
            this.circularDeque[this.last] = null;

            this.last = node.right;
            this.circularDeque[this.last].left = null;
            this.size--;

            return true;
        }

        public int getFront() {
            if (this.size == 0) return -1;
            return this.circularDeque[this.front].val;
        }

        public int getRear() {
            if (this.size == 0) return -1;
            return this.circularDeque[this.last].val;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public boolean isFull() {
            return this.size == this.max;
        }
    }

    class TreeNode {
        Integer left;
        Integer right;
        Integer val;

        public TreeNode(Integer left, Integer right, Integer val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }
}
