import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L0039_combinationSum {
    List<List<Integer>> output = new ArrayList();
    int n;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        n = candidates.length;
        
        Arrays.sort(candidates);
        
        backtrack(candidates, target, new ArrayList<Integer>(), 0);
        
        return output;
    }
    
    private void backtrack(int[] nums, int remains, ArrayList<Integer> curr, int first) {
        
        if (remains == 0) {
            output.add(new ArrayList(curr));
            return;
        } else if (remains < 0) {
            return;
        } else {
           for (int i=first; i<n; i++) {
               curr.add(nums[i]);
               backtrack(nums, remains-nums[i], curr, i);
               curr.remove(curr.size()-1);
           }
        }
        
    }
}