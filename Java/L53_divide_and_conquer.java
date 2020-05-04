
public class L53_divide_and_conquer {
    public int maxSubArray(int[] nums) {
        return findMaxSubarray(nums, 0, nums.length-1);
    }
    
    private int findMaxSubarray(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return nums[lo];
        }
        
        int mid = lo + (hi-lo)/2;
        int leftSum = findMaxSubarray(nums, lo, mid);
        int rightSum = findMaxSubarray(nums, mid+1, hi);
        int crossSum = findMaxCrossingSubarray(nums, mid, lo , hi);
        return Math.max(Math.max(leftSum, rightSum), crossSum);
        
    }
    
    private int findMaxCrossingSubarray(int[] nums, int mid, int lo, int hi) {
        int leftSum = 0, leftMax = Integer.MIN_VALUE; 
        for (int i = mid; i >= lo; i--) {
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }
        
        int rightSum = 0, rightMax = Integer.MIN_VALUE;
        for (int j = mid + 1; j <= hi; j++) {
            rightSum += nums[j];
            rightMax = Math.max(rightMax, rightSum);
        }
        return leftMax + rightMax;
    }
}