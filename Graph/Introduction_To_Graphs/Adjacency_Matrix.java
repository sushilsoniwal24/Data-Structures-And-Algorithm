package Graph.Introduction_To_Graphs;

import java.util.Scanner;

public class Adjacency_Matrix {
    static Scanner in = new Scanner(System.in);

    // ? Method To Represent Graph In Form Of A Matrix.
    public static void matrix_representation(int vertices, int edges) {
        int[][] adj = new int[vertices][vertices];

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter The Value Of Source :- ");
            int source = in.nextInt();
            System.out.print("Enter The Value Of Destination :- ");
            int destination = in.nextInt();

            adj[source][destination] = 1;
            adj[destination][source] = 1;
        }

        printGraph(vertices, edges, adj);
    }

    // ? Method To Print The Graph.
    public static void printGraph(int vertices, int edges, int[][] adj) {
        System.out.println("Representation of Graph in the form of Adjacency Matrix: ");

        // Todo :- Print In The Form Of A Matrix.
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adj[i][j] + "   ");
            }
            System.out.println();
        }

        // Todo :- Print In The Form Of Vertices Connection.
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (adj[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter The Number Of Vertices In Your Graph :- ");
        int vertices = in.nextInt();
        System.out.print("Enter The Number Of Edges In Your Graph :- ");
        int edges = in.nextInt();

        matrix_representation(vertices, edges);
    }
}
