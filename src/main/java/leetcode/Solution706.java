package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Sesh 14:28. 13/12/22
 */
public class Solution706 {

    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */
    class MyHashMap {
        Map<Integer, Integer> myMap;

        public MyHashMap() {
            myMap = new HashMap<>();
        }

        public void put(int key, int value) {
            myMap.put(key, value);
        }

        public int get(int key) {
            Integer val = myMap.get(key);
            return val == null ? -1 : val;
        }

        public void remove(int key) {
            myMap.remove(key);
        }
    }

}
