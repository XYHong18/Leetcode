# Method 1: Recursion

def permute(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    if len(nums)==0:
        return [[]]
        
    output=[]
    
    for i in range(len(nums)):
        perms = permute(nums[:i]+nums[i+1:])
            
        for perm in perms:
            output.append([nums[i]]+perm)

    return output
        
    


# Method 2: Backtracking
def permute(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    output = []
        
    backtrack([], nums, output)
        
    return output
    
    
def backtrack(curr, nums, output):
    if len(curr) == len(nums):
        output.append(list(curr))
        return
        
    for num in nums:
        if num not in curr:
            curr.append(num)
        else:
            continue
        self.backtrack(curr, nums, output)
        curr.pop()