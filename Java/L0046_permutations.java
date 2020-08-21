import java.util.ArrayList;
import java.util.List;

public class L0046_permutations {
    List<List<Integer>> output = new ArrayList();
    int n;
    
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        
        backtrack(nums, new ArrayList<Integer>());
        
        return output;
        
    }
    
    private void backtrack(int[] nums, ArrayList<Integer> curr) {
        if (curr.size() == n) {
            output.add(new ArrayList(curr));
            return;
        }
        
        for (int i=0; i<n; i++) {
            if (curr.contains(nums[i])) {
                continue;
            } else {
                curr.add(nums[i]);
            }
            
            backtrack(nums, curr);
            
            curr.remove(curr.size()-1);
        }
    }
}