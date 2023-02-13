public class NqueensPossibleOneSolution {
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
    public static boolean nQueens(char[][] board,int row) {
        if(row == board.length) {
            // printboard(board);
            count++;
             return true;
        }
        for(int j=0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) {
                    return true;
                }
                
                board[row][j] = 'X';
            }        
        }
        return false;
    }
    public static void printboard(char[][] board) {
        System.out.println("--chessboard--");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                board[i][j] = 'X';
            }
        }
        // nQueens(board, 0);
        if(nQueens(board,0)) {
        System.out.println("Solution is possible ");
        printboard(board);
        } else {
            System.out.println("SOlution is not possible ");
            printboard(board);
        }
    }
    
    
}
