import java.util.ArrayList;
import java.util.List;

public class L0448_findAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            int currentNum = Math.abs(nums[i]);
            
            if (nums[currentNum-1]>0) {
                nums[currentNum-1] = nums[currentNum-1] * (-1);
            }
        }
        
        for (int i=0; i<n; i++) {
            if (nums[i] > 0) res.add(i+1);
        }
        
        return res;
    }
}