package Recursion_And_Backtracking.Backtracking;

import java.util.ArrayList;

/* Rat In A Maze 1:- https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1 */

public class Rat_In_Maze1 {
    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        int n = maze.length;
        System.out.println(findPath(maze, n));
    }

    // Creating A Static ArrayList.
    static ArrayList<String> res = new ArrayList<>();

    public static ArrayList<String> findPath(int[][] maze, int n) {
        res.clear();

        // If start or destination is an obstacle.
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return res;
        }

        printPath("", maze, 0, 0, n);
        return res;
    }

    static void printPath(String ans, int[][] maze, int row, int col, int n) {
        // Base Condition.
        if (row == n - 1 && col == n - 1) {
            res.add(ans);
            return;
        }

        // Can't go.
        if (maze[row][col] == 0) {
            return;
        }

        // Consider This Cell In My Path.
        maze[row][col] = 0;

        // To Travel Down.
        if (row < n - 1) {
            printPath(ans + 'D', maze, row + 1, col, n);
        }

        // To Travel Right.
        if (col < n - 1) {
            printPath(ans + 'R', maze, row, col + 1, n);
        }

        // To Travel Up.
        if (row > 0) {
            printPath(ans + 'U', maze, row - 1, col, n);
        }

        // To Travel Left.
        if (col > 0) {
            printPath(ans + 'L', maze, row, col - 1, n);
        }

        // BackTrack:- Remove The Changes That We Were Made.
        maze[row][col] = 1;
    }
}
