package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution146 {
    static class LRUCache {
        //Initialise Head,tail
        Node head = new Node(0, 0);
        Node tail = new Node(0, 0);
        int capacity;
        Map<Integer, Node> map = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                insert(node);
                return node.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
            }
            if (map.size() == capacity) {
                remove(tail.prev);
            }
            insert(new Node(key, value));
        }

        private void remove(Node node) {
            map.remove(node.key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insert(Node node) {
            map.put(node.key, node);
            node.next = head.next;
            node.next.prev = node;
            head.next = node;
            node.prev = head;
        }

        static class Node {
            Node next;
            Node prev;
            int key;
            int value;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }


    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);         // cache is {1=1}
        lRUCache.put(2, 2);         // cache is {1=1, 2=2}
        System.out.println("lRUCache.get(1) = " + lRUCache.get(1));            // return 1
        lRUCache.put(3, 3);         // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println("lRUCache.get(2) = " + lRUCache.get(2));            // returns -1 (not found)
        lRUCache.put(4, 4);         // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println("lRUCache.get(1) = " + lRUCache.get(1));// return -1 (not found)
        System.out.println("lRUCache.get(3) = " + lRUCache.get(3));            // return 3
        System.out.println("lRUCache.get(4) = " + lRUCache.get(4));            // return 4
    }

    class LRUCakche {
        class Node {
            int key;
            int value;

            Node prev;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        public Node[] map;
        public int count;
        public int capacity;

        public Node head;
        public Node tail;

        public LRUCakche(int capacity) {

            this.capacity = capacity;
            count = 0;

            map = new Node[10_000 + 1];

            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            tail.prev = head;

            head.prev = null;
            tail.next = null;
        }

        public void deleteNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        public void addToHead(Node node) {
            node.next = head.next;
            node.next.prev = node;
            node.prev = head;

            head.next = node;
        }

        public int get(int key) {

            if (map[key] != null) {
                Node node = map[key];
                int nodeVal = node.value;

                deleteNode(node);
                addToHead(node);

                return nodeVal;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {

            if (map[key] != null) {

                Node node = map[key];

                node.value = value;

                deleteNode(node);

                addToHead(node);

            } else {

                Node node = new Node(key, value);

                map[key] = node;

                if (count < capacity) {
                    count++;
                    addToHead(node);
                } else {

                    map[tail.prev.key] = null;
                    deleteNode(tail.prev);

                    addToHead(node);
                }
            }

            return;
        }

    }
}


