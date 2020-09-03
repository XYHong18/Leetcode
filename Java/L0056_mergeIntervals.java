import java.util.ArrayList;
import java.util.Arrays;

// Method 1
public class L0056_mergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        ArrayList<int[]> res = new ArrayList<int[]>();
        
        for (int i=0; i<n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int l=0;
        int r=1;
        
        while (r<=n) {
            if (r==n || starts[r] > ends[r-1]) {
                int[] element = new int[]{starts[l], ends[r-1]};
                res.add(element);
                l = r;
            }
            
            r++;
        }
        
        return res.toArray(new int[res.size()][]);
    }
}

