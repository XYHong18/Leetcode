
public class L0200_numberOfIslands {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length;
        
        if (m!=0) {
            int n = grid[0].length;
            
            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    if (grid[i][j] == '1') {
                        res++;
                        dfs(grid, i, j, m, n);
                    }
                }
            }
        }
        
        return res;
    }
    
    private void dfs(char[][] grid, int i, int j, int m, int n) {
        grid[i][j] = '*';
        
        if (i+1<m && grid[i+1][j] == '1') {
            dfs(grid, i+1, j, m, n);
        }
        
        if (j+1<n && grid[i][j+1] == '1') {
            dfs(grid, i, j+1, m, n);
        }
        
        if (i-1>=0 && grid[i-1][j] == '1') {
            dfs(grid, i-1, j, m, n);  
        }
        
        if (j-1>=0 && grid[i][j-1] == '1') {
            dfs(grid, i, j-1, m, n);
        }
        
    }
}



/* 
Complexity Analysis
1. Running time: O(mn)
2. Space complexity: O(mn) ???
*/