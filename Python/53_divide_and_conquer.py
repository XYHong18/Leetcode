def maxSubArray(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    return find_max_subarray(nums, 0, len(nums)-1)
        
        
def find_max_subarray(nums, lo, hi):
    if lo == hi:
        return nums[lo]

    mid = lo + (hi-lo)//2
    leftMax = find_max_subarray(nums, lo, mid)
    rightMax = find_max_subarray(nums, mid+1, hi)
    crossMax = find_max_crossing_subarray(nums, mid, lo, hi)
    return max(leftMax, rightMax, crossMax)

def find_max_crossing_subarray(nums, mid, lo, hi):
    leftSum = rightSum = 0
    leftMax = rightMax = float("-inf")

    for i in range(mid, lo-1, -1):
        leftSum += nums[i]
        leftMax = max(leftSum, leftMax)
    
    for j in range(mid+1, hi+1):
        rightSum += nums[j]
        rightMax = max(rightSum, rightMax)

    return leftMax+rightMax



########## Complexity Analysis ##########
## 1. Running time: O(nlogn)
## 2. Space Complexity: O(logn) ???