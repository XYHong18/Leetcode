public class L0054_spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix.length==0) return res;
        int left=0, right=matrix[0].length-1, up=0, down=matrix.length-1;
        int count = 0;
        
        while (up<=down && left<=right) {
            if (count % 4 == 0) {
                
                for (int i=left; i<=right; i++) {
                    res.add(matrix[up][i]);
                }
                
                up++;
                
            } else if (count % 4 == 1) {
                
                for (int i=up; i<=down; i++) {
                    res.add(matrix[i][right]);
                }
                
                right--;
                
            } else if (count % 4 == 2) {
                
                for (int i=right; i>=left; i--) {
                    res.add(matrix[down][i]);
                }
                
                down--;
                
            } else {
                
                for (int i=down; i>=up; i--) {
                    res.add(matrix[i][left]);
                }
                
                left++;
            }
            
            count++;
        }
        
        return res;
        
    }
}