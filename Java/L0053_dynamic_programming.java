
public class L0053_dynamic_programming {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; 
        dp[0] = nums[0];
        int res = nums[0];
        
        if (n>1) {
            for (int i= 1; i<n; i++) {
                dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
                res = Math.max(dp[i], res);
            }
        }
        
        return res;
    }
}