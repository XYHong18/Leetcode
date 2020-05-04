# Leetcode Solutions

## 53. Maximum Subarray
### Method 1: Divide and conquer:  
Any contiguous subarray A[i...j] of A[low...high] must lie in exactly one of the following places:  
(1) entirely in the subarray A[low...mid], so that low <= i <= j <= mid;  
(2) entirely in the subarray A[mid...high], so that mid <= i <= j <= high;  
(3) or crossing the midpoint, so that low <= i <= mid <= j <= high.
### Method 2: Dynamic Programming:    
Define the largest sum of the subarray that ends at nums[i] as dp[i], then  
dp[i] = max(nums[i], nums[i]+dp[i-1]) 

## 912. Sort an Array
### Method 1: Merge-sort
### Method 2: Quick-sort  
(The difference between the two methods can be found here: https://www.geeksforgeeks.org/quicksort-better-mergesort/.)



