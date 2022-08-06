package Recursion_And_Backtracking.Recursion.Recursion_Mazes;

import java.util.ArrayList;

/**
 * Find_Paths1:- RETURN ALL PATHS TO REACH THE TARGET, WHILE WE CAN EITHER GO
 * RIGHT AND DOWN.
 */
public class Find_Paths1 {
    public static void main(String[] args) {
        System.out.println(totalPaths(0, 0));
        printPaths("", 0, 0);
        System.out.println(getPaths("", 0, 0));
    }

    /* Number of paths to reach the target. */
    public static int totalPaths(int row, int col) {

        // Base Condition:- We have only one way to go.
        if (row == 2 || col == 2) {
            return 1;
        }

        // To Travel Down.
        int down = totalPaths(row + 1, col);

        // To Travel Right.
        int right = totalPaths(row, col + 1);

        return down + right;

    }

    /* Print the exact paths to reach the target. */
    public static void printPaths(String ans, int row, int col) {

        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            System.out.println(ans);
            return;
        }

        // To Travel Down.
        if (row < 2) {
            printPaths(ans + 'D', row + 1, col);
        }

        // To Travel Right.
        if (col < 2) {
            printPaths(ans + 'R', row, col + 1);
        }

    }

    /* Return the exact paths to reach the target in an ArrayList. */
    public static ArrayList<String> getPaths(String ans, int row, int col) {

        // Base Condition:- We have only one way to go.
        if (row == 2 && col == 2) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> local = new ArrayList<>(); // Contain answer for this function call only.

        // To Travel Down.
        if (row < 2) {
            local.addAll(getPaths(ans + 'D', row + 1, col));
        }

        // To Travel Right.
        if (col < 2) {
            local.addAll(getPaths(ans + 'R', row, col + 1));
        }

        return local;

    }
}