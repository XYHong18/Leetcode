def maxSubArray(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    n = len(nums)
    dp = [0] * n
    dp[0] = res = nums[0]

    if n > 1:
        for i in range(1, n):
            if dp[i-1] > 0:
                dp[i] = nums[i] + dp[i-1]
            else:
                dp[i] = nums[i]
            res = max(res, dp[i])
    
    return res


########## Complexity Analysis ##########
## 1. Running time: O(n)
## 2. Space Complexity: O(n)

