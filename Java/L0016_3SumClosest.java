import java.util.Arrays;

public class L0016_3SumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int n = nums.length;
        int res = 0;
        
        for (int i=0; i<n-2; i++) {
            int l = i+1;
            int r = n-1;
            
            while (l<r) {
                if (Math.abs(nums[i]+nums[l]+nums[r]-target) < diff) {
                    res = nums[i]+nums[l]+nums[r];
                    diff = Math.abs(nums[i]+nums[l]+nums[r]-target);
                }
                
                if (nums[i]+nums[l]+nums[r]>=target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        
        return res;
        
    }
}