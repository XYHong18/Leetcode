# Method 1: Recursion

def subsets(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    
    if len(nums) == 0:
        return [[]]
        
    output = []
        
    rest = self.subsets(nums[1:])
        
    for x in rest:
        output.append(x)
        output.append([nums[0]]+x)
            
    return output

    
# Method 2: Backtracking
def subsets(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    output = []
        
    backtrack(nums, [], output, 0)
        
    return output
    
    
def backtrack(nums, curr, output, first):
    output.append(list(curr))
        
    if first == len(nums):
        return
        
    for i in range(first, len(nums)):
        curr.append(nums[i])
        backtrack(nums, curr, output, i+1)
        curr.pop()



