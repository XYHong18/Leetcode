public class L238_productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        int prod = 1;
        
        for (int i=1; i<n; i++) {
            prod = prod * nums[i-1];
            res[i] = prod;
        }
        
        prod = 1;
        
        for (int j=n-2; j>-1; j--) {
            prod = prod * nums[j+1];
            res[j] = prod * res[j];
        }
        
        return res;
    }
}


/*
Complexity Analysis: 
1. Time Complexity: O(n)
2. Space Complexity: O(n)
*/