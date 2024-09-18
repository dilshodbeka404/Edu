package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author Dilshodbek Akhmedov, Sesh 09:17. 29/11/22
 */
public class Solution380 {
    class RandomizedSet {
        ArrayList<Integer> nums;
        HashMap<Integer, Integer> locs;
        Random rnd;

        public RandomizedSet() {
            this.nums = new ArrayList<>();
            this.locs = new HashMap<>();
            this.rnd = new Random();
        }

        public boolean insert(int val) {
            if (locs.containsKey(val)) return false;
            locs.put(val, nums.size());
            nums.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!locs.containsKey(val)) return false;
            int loc = locs.get(val);
            if (loc < nums.size() - 1) {
                int las = nums.get(nums.size() - 1);
                nums.set(loc, las);
                locs.put(las, loc);
            }
            locs.remove(val);
            nums.remove(nums.size() - 1);
            return true;
        }

        public int getRandom() {
            return nums.get(rnd.nextInt(nums.size()));
        }
    }
}
