import java.util.HashMap;

public class L0001_twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int n = nums.length;
        int[] res = new int[2];
        
        for (int i=0; i<n; i++) {
            if (tracker.containsKey(target-nums[i])) {
                res[0] = tracker.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            
            tracker.put(nums[i], i);
        }
        
        return res;
    }
}