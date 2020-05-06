# Leetcode Solutions

## 1. Two Sum
* [x] **Method: Hash Table**

## 53. Maximum Subarray
* [x] **Method 1: Divide and conquer:**  
Any contiguous subarray A[i...j] of A[low...high] must lie in exactly one of the following places:  
(1) entirely in the subarray A[low...mid], so that low <= i <= j <= mid;  
(2) entirely in the subarray A[mid...high], so that mid <= i <= j <= high;  
(3) or crossing the midpoint, so that low <= i <= mid <= j <= high.
* [x] **Method 2: Dynamic Programming:** 
Define the largest sum of the subarray that ends at nums[i] as dp[i], then  
dp[i] = max(nums[i], nums[i]+dp[i-1]) 

## 200. Number of Islands
* [x] **Method 1: DFS**
* [] **Method 2: BFS**
* [] **Method 3: Union Find**

## 912. Sort an Array
* [x] **Method 1: Merge-sort**
* [x] **Method 2: Quick-sort**
(The difference between the two methods can be found here: https://www.geeksforgeeks.org/quicksort-better-mergesort/.)



