public class L0031_nextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        int j =0;
        int temp = 0;
        
        while (i>=0) {
            if (nums[i] < nums[i+1]) {
                break;
            }
            
            i--;
        }
        
        if (i != -1) {
            for (j=n-1; j>i;j--) {
                if (nums[j] > nums[i]) {
                    break;
                }
            }
            
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        int l = i+1;
        int r = n-1;
        
        while (l < r) {
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        
    }
}