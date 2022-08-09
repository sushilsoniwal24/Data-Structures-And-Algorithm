package Recursion_And_Backtracking.Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * N_Queens1 :- https://leetcode.com/problems/n-queens/
 */
public class N_Queens1 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }

    public static List<List<String>> solveNQueens(int n) {

        /* Resultant List. */
        List<List<String>> res = new ArrayList<>();

        // N*N Board.
        char[][] board = new char[n][n];

        // Initialize board with a single dot.
        for (int row_idx = 0; row_idx < n; row_idx++) {
            for (int col_idx = 0; col_idx < n; col_idx++) {
                board[row_idx][col_idx] = '.';
            }
        }

        /* Calling placeQueens Function. */
        placeQueens(0, board, res);

        return res;
    }

    /* Function To Place Queens On A N*N ChessBoard. */
    private static void placeQueens(int col, char[][] board, List<List<String>> res) {

        // Base Condition:- when we are at the last col.
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Placing A Queen.
                placeQueens(col + 1, board, res); // Recursive Call.
                board[row][col] = '.'; // BackTrack.
            }
        }
    }

    /* Function To Construct Our Board. */
    private static List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String str = new String(board[i]);
            ans.add(str);
        }
        return ans;
    }

    /* Function To Check Whether An Index Is Safe Or Not. */
    private static boolean isSafe(char[][] board, int row, int col) {

        int dupRow = row;
        int dupCol = col;

        /* To Check Upper-Left-Diagonal. */
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;

        /* To Check Left. */
        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }

        row = dupRow;
        col = dupCol;

        /* To Check Down-Left_Diagonal. */
        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

}