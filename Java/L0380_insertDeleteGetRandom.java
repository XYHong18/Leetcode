import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class L0380_insertDeleteGetRandom {
    HashMap<Integer, Integer> data;
    ArrayList<Integer> nums;
    Random rand;

    /**
     * Initialize your data structure here.
     */
    public void RandomizedSet() {
        data = new HashMap<Integer, Integer>();
        nums = new ArrayList<Integer>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        boolean res;
        
        if (data.containsKey(val)) {
            res = false;
        } else {
            nums.add(val);
            data.put(val, nums.size()-1);
            res = true;
        }
        
        return res;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean res;
        
        if (data.containsKey(val)) {
            int index = data.get(val);
            int n = nums.size();
    
            if (index < n-1) {
                int last = nums.get(n-1);
                nums.set(index, last);
                data.put(last, index);
            }
            nums.remove(n-1);
            data.remove(val);
            res = true;
        } else {
            res = false;
        }
        
        return res;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int randomInt = nums.get(rand.nextInt(nums.size()));
        return randomInt;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */