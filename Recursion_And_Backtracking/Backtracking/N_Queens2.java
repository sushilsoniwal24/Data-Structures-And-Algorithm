package Recursion_And_Backtracking.Backtracking;

/**
 * N_Queens2 :- https://leetcode.com/problems/n-queens-ii/
 */
public class N_Queens2 {
    public static void main(String[] args) {
        
    }

    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return count(board, 0);
    }

    private static int count(boolean[][] board, int col) {
        if (col == board.length) {
            return 1;
        }

        int c = 0; // Number of answers.

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true; // Place The Queen.
                c += count(board, col + 1);
                board[row][col] = false; // BackTrack
            }
        }
        return c;
    }

    /* Function To Check Whether An Index Is Safe Or Not. */
    private static boolean isSafe(boolean[][] board, int row, int col) {
        int origRow = row;
        int origCol = col;

        // To Check Upper-Left-Diagonal.
        while (row >= 0 && col >= 0) {
            if (board[row][col] == true) {
                return false;
            }
            row--;
            col--;
        }

        row = origRow;
        col = origCol;

        // To Check Left.
        while (col >= 0) {
            if (board[row][col] == true) {
                return false;
            }
            col--;
        }

        row = origRow;
        col = origCol;

        // To Check Down-Left_Diagonal.
        while (row < board.length && col >= 0) {
            if (board[row][col] == true)
                return false;

            --col;
            ++row;
        }

        return true;
    }
    
}