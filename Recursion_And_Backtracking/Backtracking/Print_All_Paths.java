package Recursion_And_Backtracking.Backtracking;

/* PRINT THE PATHS THAT WE CAN FOLLOW TO REACH THE TARGET, WE CAN MOVE UP-DOWN-RIGHT-LEFT. */

public class Print_All_Paths {
    public static void main(String[] args) {

        boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };
        printPath("", maze, 0, 0);

    }

    // Print The Path To Follow.
    public static void printPath(String ans, boolean[][] maze, int row, int col) {

        // Base Case.
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }

        // Obstacle Case.
        if (!maze[row][col]) {
            return;
        }

        // Considering A Cell In Our Path.
        maze[row][col] = false;

        // To Travel Down.
        if (row < maze.length - 1) {
            printPath(ans + 'D', maze, row + 1, col);
        }

        // To Travel Right.
        if (col < maze[0].length - 1) {
            printPath(ans + 'R', maze, row, col + 1);
        }

        // To Travel Up.
        if (row > 0) {
            printPath(ans + 'U', maze, row - 1, col);
        }

        // To Travel Left.
        if (col > 0) {
            printPath(ans + 'L', maze, row, col - 1);
        }

        // BackTrack:- Remove The Changes That We Were Made Previously.
        maze[row][col] = true;

    }
}
