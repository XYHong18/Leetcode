public class L0034_findFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        
        if (nums.length==0) return res;
        
        int left = 0;
        int right = nums.length-1;
        
        int starting = findStarting(nums, target, left, right);
        int ending = findEnding(nums, target, left, right);
        
        res[0] = starting;
        res[1] = ending;
        
        return res;
        
    }
    
    private int findStarting(int[] nums, int target, int left, int right) {
        if (left <= right) {
            
            int mid = left + (right-left)/2;
            
            if (nums[mid]==target) {
                if (mid==0 || nums[mid-1]<nums[mid]) {
                    return mid;
                } else {
                    return findStarting(nums, target, left, mid-1);
                }
            } else if (nums[mid]<target) {
                return findStarting(nums, target, mid+1, right);
            } else {
                return findStarting(nums, target, left, mid-1);
            }
                
            
        } else {
            return -1;
        }
        
    }
    
    private int findEnding(int[] nums, int target, int left, int right) {
        if (left <= right) {
            
            int mid = left + (right-left)/2;
            
            if (nums[mid]==target) {
                if (mid==nums.length-1 || nums[mid]<nums[mid+1]) {
                    return mid;
                } else {
                    return findEnding(nums, target, mid+1, right);
                }
            } else if (nums[mid]<target) {
                return findEnding(nums, target, mid+1, right);
            } else {
                return findEnding(nums, target, left, mid-1);
            }
                
            
        } else {
            return -1;
        }
        
    }
}