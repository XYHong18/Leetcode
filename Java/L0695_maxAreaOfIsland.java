public class L0695_maxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m=grid.length, n=grid[0].length;
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 1) {
                    int currentArea = helper(grid, i, j, m, n);
                    maxArea = Math.max(maxArea, currentArea);
                }
                
            }
        }
        
        return maxArea;
    }
    
    private int helper(int[][] grid, int i, int j, int m, int n) {
        int currentArea = 1;
        grid[i][j]=0;
        
        if (i-1>=0 && grid[i-1][j]==1) currentArea += helper(grid, i-1, j, m, n);
        if (i+1<m && grid[i+1][j]==1) currentArea += helper(grid, i+1, j, m, n);
        if (j-1>=0 && grid[i][j-1]==1) currentArea += helper(grid, i, j-1, m, n);
        if (j+1<n && grid[i][j+1]==1) currentArea += helper(grid, i, j+1, m, n);
        
        return currentArea;
    }
}