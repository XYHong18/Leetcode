public class L0152_maximumProductSubarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int res = nums[0];
        
        for (int i=1; i<n; i++) {
            int a = nums[i] * dp[i-1][0];
            int b = nums[i] * dp[i-1][1];
            
            dp[i][0] = Math.min(Math.min(a, b), nums[i]);
            dp[i][1] = Math.max(Math.max(a, b), nums[i]);
            
            res = Math.max(res, dp[i][1]);
        }
        
        return res;
    }
}