public class L0209_minimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n==0) return 0;
        int minLen = Integer.MAX_VALUE;
        int i=0, j=0, currentSum=0;
        
        while (j<n) {
            currentSum += nums[j];
            
            while (currentSum >= s) {
                minLen = Math.min(minLen, j-i+1);
                currentSum -= nums[i];
                i++;
            }
            
            j++;
        }
        
        return (minLen==Integer.MAX_VALUE) ? 0 : minLen;
        
    }
}