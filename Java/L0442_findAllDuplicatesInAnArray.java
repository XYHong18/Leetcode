import java.util.ArrayList;
import java.util.List;

public class L0442_findAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            int currentNum = Math.abs(nums[i]);
            
            if (nums[currentNum-1] < 0) {
                res.add(currentNum);
            }
            
            nums[currentNum-1] = (-1) * nums[currentNum-1];
        }
        
        
        return res;
    }
}