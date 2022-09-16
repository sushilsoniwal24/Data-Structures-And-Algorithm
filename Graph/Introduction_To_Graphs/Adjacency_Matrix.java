package Graph.Introduction_To_Graphs;

public class Adjacency_Matrix {
    int vertices;
    int[][] matrix;

    Adjacency_Matrix(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    // ! Add An Edge :- O(1).
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    // ! Delete An Edge :- O(1).
    public void deleteEdge(int source, int destination) {
        matrix[source][destination] = 0;
        matrix[destination][source] = 0;
    }

    // ! Print The Graph.
    public void printGraph() {
        System.out.println("Representation of Graph in the form of Adjacency Matrix: ");

        // Todo :- Print In The Form Of A Matrix.
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

        // Todo :- Print In The Form Of Vertices Connection.
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertices; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Adjacency_Matrix adj = new Adjacency_Matrix(5);
        adj.addEdge(0, 1);
        adj.addEdge(0, 4);
        adj.addEdge(1, 2);
        adj.addEdge(1, 3);
        adj.addEdge(1, 4);
        adj.addEdge(2, 3);
        adj.addEdge(3, 4);

        adj.printGraph();
    }
}
