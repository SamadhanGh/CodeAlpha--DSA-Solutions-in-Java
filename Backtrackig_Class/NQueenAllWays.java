package Backtrackig_Class;

public class NQueenAllWays {

    // Check if placing a queen at board[row][col] is safe
    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Main backtracking function to solve N-Queens
    public static void nQueens(char[][] board, int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place Queen
                nQueens(board, row + 1); // Recurse
                board[row][j] = 'x'; // Backtrack
            }
        }
    }

    // Print the chess board
    public static void printBoard(char[][] board) {
        System.out.println("===============Chess Board================");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }
}
