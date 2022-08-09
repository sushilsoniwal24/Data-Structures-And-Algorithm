package Recursion_And_Backtracking.Backtracking;

/**
 * Sudoku_Solver :- https://leetcode.com/problems/sudoku-solver/
 */
public class Sudoku_Solver {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        solveSudoku(board);

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        solve(board);
    }

    private static boolean solve(char[][] board) {
        for (int row_idx = 0; row_idx < board.length; row_idx++) {
            for (int col_idx = 0; col_idx < board[0].length; col_idx++) {
                if (board[row_idx][col_idx] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, row_idx, col_idx, ch)) {
                            board[row_idx][col_idx] = ch;
                            if (solve(board)) { // Recursive Call.
                                return true;
                            } else {
                                board[row_idx][col_idx] = '.'; // BackTrack.
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row_idx, int col_idx, char ch) {

        // To Check In Row.
        for (int index = 0; index < 9; index++) {
            if (board[index][col_idx] == ch)
                return false;
        }

        // To Check In Column.
        for (int index = 0; index < 9; index++) {
            if (board[row_idx][index] == ch)
                return false;
        }

        // To Check In Box.
        int x = (row_idx / 3) * 3;
        int y = (col_idx / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[x + i][y + j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }

}