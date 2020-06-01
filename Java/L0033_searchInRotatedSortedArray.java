public class L0033_searchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        
        return (n==0) ? -1 : binarySearch(nums, target, 0, n);
    }
    
    private int binarySearch(int[] nums, int target, int l, int r) {
        if (l < r) {
            int mid = l + (r-l)/2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[l] < nums[mid] && nums[mid] > nums[r-1]) {
                if (nums[mid] > target) {
                    if (nums[l] > target) {
                        return binarySearch(nums, target, mid+1, r);
                    } else {
                        return binarySearch(nums, target, l, mid);
                    }
                } else {
                    return binarySearch(nums, target, mid+1, r);
                }
            } else {
                if (nums[mid] > target) {
                   return binarySearch(nums, target, l, mid);
               } else {
                   if (nums[r-1] < target) {
                       return binarySearch(nums, target, l, mid);
                   } else {
                       return binarySearch(nums, target, mid+1, r);
                   }
               }
            }
            
        } else {
            return (nums[l] == target) ? l : -1;
        }
    }
}


/*  
Complexity Analysis:
1. Time Complexity: O(logn)
2. Space Complexity: O(1)
*/