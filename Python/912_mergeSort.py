def sortArray(nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    mergeSort(nums, 0, len(nums)-1)
    return nums

def merge(A, l, p, r):
    n1 = p-l+1
    n2 = r-p
        
    L = A[l:p+1]
    R = A[p+1:r+1]
        
    i = j = 0
    k = l
        
    while i<n1 and j<n2:
        if L[i] < R[j]:
            A[k] = L[i]
            i += 1
        else:
            A[k] = R[j]
            j += 1
        k += 1
        
    if i < n1:
        A[k:] = L[i:]
        
    if j < n2:
        A[k:] = R[j:]


def mergeSort(A, l, r):
    if l < r:
        p = (l+r)//2
        mergeSort(A, l, p)
        mergeSort(A, p+1, r)
        merge(A, l, p, r)


########## Complexity Analysis #########
# Running Time: O(nlogn)
# Space Complexity: O(1)