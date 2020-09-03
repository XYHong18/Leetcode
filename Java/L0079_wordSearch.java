public class L0079_wordSearch {
    int m, n;
    
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == word.charAt(0) && backtrack(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean backtrack(char[][] board, String word, int count, int i, int j) {
        if (count == word.length()) {
            return true;
        }
        
        if (i<0 || i>=m || j<0 || j>=n || board[i][j] != word.charAt(count)) return false;
        
        board[i][j] = '#';
        
        boolean output = backtrack(board, word, count+1, i-1, j) || 
                         backtrack(board, word, count+1, i+1, j) ||
                         backtrack(board, word, count+1, i, j-1) ||
                         backtrack(board, word, count+1, i, j+1);
        
        board[i][j] = word.charAt(count);
        
        return output;
        
    }
}