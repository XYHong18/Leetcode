import java.util.ArrayList;
import java.util.List;

/* Method: Backtracking */

public class L0078_Subsets {
    List<List<Integer>> output = new ArrayList();
    int n;

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        
        backtrack(nums, 0, new ArrayList<Integer>());
        
        return output;
    }

    private void backtrack(int[] nums, int first, ArrayList<Integer> curr) {
        output.add(new ArrayList(curr));
        
        if (first == n) return;
        
        for (int i=first; i<n; i++) {
            curr.add(nums[i]);
            backtrack(nums, i+1, curr);
            curr.remove(curr.size()-1);
        }
    }
}