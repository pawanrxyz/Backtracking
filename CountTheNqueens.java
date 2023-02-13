public class CountTheNqueens {
    public static boolean isSafe(char[][] board,int row,int col) {
        //vertical
        for(int i=row-1;i>=0;i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //diag left up
        for(int i=row-1,j=col=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //diag right;
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
     }
     public static void nQueens(char[][] board,int row) {
         if(row == board.length) {
             // printboard(board);
             count++;
             return;
        }
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        
        }
    }
    static int count = 0;
    public static void printboard(char[][] board) {
        System.out.println("--chessboard--");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        System.out.println("Totoal number of ways:  "+count);
    }
        
}