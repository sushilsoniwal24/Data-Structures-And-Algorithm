package Graph.Introduction_To_Graphs;

import java.util.Scanner;

public class Adjacency_Matrix {
    static Scanner in = new Scanner(System.in);

    /* (1) Adjacency Matrix Representation Of Graph. */
    public static void adjMat(int n, int m) {
        int[][] graph_mat = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int source = in.nextInt();
            int destination = in.nextInt();

            graph_mat[source][destination] = 1;
            graph_mat[destination][source] = 1;
        }

        // ! Print In The Form Of A Matrix.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph_mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjMat(4, 5);
    }
}
