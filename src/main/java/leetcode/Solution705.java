package leetcode;

public class Solution705 {

    class MyHashSet {
        int[] mySet;

        public MyHashSet() {
            this.mySet = new int[100000];
            mySet[0] = -1;
        }

        public void add(int key) {
            mySet[key] = key;
        }

        public void remove(int key) {
            if (key == 0)
                mySet[key] = -1;
            else
                mySet[key] = 0;
        }

        public boolean contains(int key) {
            return mySet[key] == key;
        }
    }
}
