package Arrays.Array_2D.Matrix_Searching;

import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
        int[] idx = search(mat, 8);
        System.out.println(Arrays.toString(idx));
    }

    // Time Complexity = O(n) & Space Complexity = O(1).
    public static int[] search(int[][] mat, int target) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == target)
                    return new int[] { row, col };
            }
        }
        return new int[] { -1, -1 };// Target Not Found.
    }
}
