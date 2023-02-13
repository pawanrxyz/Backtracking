public class NqueensPossible {
    public static void nQueens(char board[][],int row) {
        if(row == board.length) {
            printBoard(board);
            return;
        }
        //coloumn loop
        for(int j=0;j<board.length;j++) {
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'x';
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("------chess board-------");
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board.length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        
        //initilize
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = 'x';
            }
        }     
        // printBoard(board);
        nQueens(board, 0);   

    }
}