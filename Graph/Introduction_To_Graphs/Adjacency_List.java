package Graph.Introduction_To_Graphs;

import java.util.ArrayList;

public class Adjacency_List {
    int vertices;

    // ! Add An Edge :- O(1).
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination) {

        // * Adding an edge from source to destination
        adj.get(source).add(destination);

        // * Adding an edge from destination to source
        adj.get(destination).add(source);
    }

    // ! Delete An Edge :- O(1).
    public static void deleteEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        adj.get(source).remove(destination);
    }

    // ! Print The Graph.
    public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        System.out.println("Adjacency List representation of Graph: ");

        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency List of vertex " + i);
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(vertices);

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }
}
