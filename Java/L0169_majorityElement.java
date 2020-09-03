import java.util.HashMap;

// Method1: HashMap
public class L0169_majorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int res=0;
        
        for (int num: nums) {
            if (tracker.containsKey(num)) {
                tracker.put(num, tracker.get(num)+1);
            } else {
                tracker.put(num, 1);
            }
            
            if (tracker.get(num) > n/2) {
                res = num;
                break;
            }
        }
        
       return res;
    }
}

// Method2: the median
public class L0169_majorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}
