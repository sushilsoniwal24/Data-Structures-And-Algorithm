package Recursion_And_Backtracking.Recursion.Recursion_Mazes;

public class Path_With_Obstacles {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true }, { true, false, true }, { true, true, true } };
        printPaths("", maze, 0, 0);
    }

    public static void printPaths(String ans, boolean[][] maze, int row, int col) {
        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            System.out.println(ans);
            return;
        }

        // Obstacle Case.
        if (!maze[row][col]) {
            return;
        }

        // To Travel Down.
        if (row < 2) {
            printPaths(ans + 'D', maze, row + 1, col);
        }

        // To Travel Right.
        if (col < 2) {
            printPaths(ans + 'R', maze, row, col + 1);
        }

    }
}
