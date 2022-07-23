package Arrays.Array_2D.Matrix_Searching;

public class Binary_Search_Row_Col_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 50 }
        };

        System.out.println(search(mat, 35));
    }

    // Time Complexity = O(m+n) & Space Complexity = O(1).
    public static boolean search(int[][] mat, int target) {

        int m = mat.length;// No. Of Rows.
        int n = mat[0].length;// No. Of Cols In First Row.

        int start = 0; // 0'th row.
        int end = n - 1; // last col.

        while (start < m && end >= 0) {
            int num = mat[start][end];
            if (num == target)
                return true;
            else if (num > target)
                end--;
            else
                start++;
        }

        return false; // Element Not Found.
    }
}
