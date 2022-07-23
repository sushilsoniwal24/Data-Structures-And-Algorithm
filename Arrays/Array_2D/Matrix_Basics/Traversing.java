package Arrays.Array_2D.Matrix_Basics;

public class Traversing {
    public static void main(String[] args) {

        /*
         * N*N Matrix => Number Of Rows == Number Of Columns.
         * int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
         * type1(mat1, 3);
         */

        /*
         * M*N Matrix => Number Of Rows != Number Of Columns.
         * int[][] mat2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
         * type2(mat2, 3, 4);
         */

        /*
         * Column Not Fixed.
         * int[][] mat3 = { { 1, 2, 3 }, { 4 }, { 5, 6, 7, 8 } };
         * type3(mat3);
         */
    }

    // N*N Matrix.
    public static void type1(int[][] mat1, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Element at (" + i + "," + j + ") is = " + mat1[i][j]);
            }
        }

    }

    // M*N Matrix.
    public static void type2(int[][] mat2, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Element at (" + i + "," + j + ") is = " + mat2[i][j]);
            }
        }

    }

    // Variable Number Of Columns.
    public static void type3(int[][] mat3) {

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                System.out.println("Element at (" + i + "," + j + ") is = " + mat3[i][j]);
            }
        }
    }
}
