public class L0289_gameOfLife {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                int countLive = 0;
                
                for (int p=Math.max(i-1,0); p<Math.min(rows, i+2); p++) {
                    for (int q=Math.max(j-1,0); q<Math.min(cols, j+2); q++) {
                        
                        if (board[p][q]==1 || board[p][q]==2) countLive++;
                        
                    }
                }
                countLive -= board[i][j];
                if (board[i][j]==1 && (countLive<2 || countLive>3)) board[i][j]=2;
                if (board[i][j]==0 && countLive==3) board[i][j]=3;
            }
        }
        
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (board[i][j]==2) board[i][j]=0;
                if (board[i][j]==3) board[i][j]=1;
            }
        }
        
        
    }
}