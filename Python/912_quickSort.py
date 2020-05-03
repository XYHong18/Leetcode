def sortArray(nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    quickSort(nums, 0, len(nums)-1)
    return nums
    
def partition(A, p, r):
    pivot = A[r]
    i = p-1
        
    for j in range(p, r):
        if A[j] < A[r]:
            i += 1
            A[i], A[j] = A[j], A[i]
        
    A[i+1], A[r] = A[r], A[i+1]
        
    return i+1
    
def quickSort(A, p, r):
    if p < r:
        q = partition(A, p, r)
        quickSort(A, p, q-1)
        quickSort(A, q+1, r)


########## Complexity Analysis ##########
## 1. Average running time: O(nlogn)
## 2. Best running time: O(nlogn)
## 3. Worst running time: O(n^2)
## 4. Space complexity: O(1)