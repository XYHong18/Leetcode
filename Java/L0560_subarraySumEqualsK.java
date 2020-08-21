import java.util.HashMap;

public class L0560_subarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n==0) return 0;
        int res = 0, s=0, target=0;
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        
        for (int i=0; i<n; i++) {
            s = nums[i] + s;
            if (s == k) res++;
            target = s-k;
            
            if (tracker.containsKey(target)) res = res + tracker.get(target);
            
            if (tracker.containsKey(s)) {
                tracker.put(s, tracker.get(s)+1);
            } else {
                tracker.put(s, 1);
            }            
        }
         
        return res;
    }
}