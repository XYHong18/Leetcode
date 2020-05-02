def sortArray(nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    mergeSort(nums)
    return nums

def mergeSort(A):
    if len(A) > 1:
        mid = len(A) // 2
        L = A[:mid]
        R = A[mid:]

        i = j = k = 0

        while i<len(L) and j<len(R):
            if L[i] < R[j]:
                A[k] = L[i]
                i += 1
            else:
                A[k] = R[j]
                j += 1
            k +=1
        
        if i < len(L):
            A[k:] = L[i:]

        if j < len(R):
            A[k:] = R[j:]


########## Complexity Analysis #########
# Running Time: O(nlogn)
# Space Complexity: O(1)