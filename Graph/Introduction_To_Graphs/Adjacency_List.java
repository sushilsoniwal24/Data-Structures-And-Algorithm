package Graph.Introduction_To_Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class Adjacency_List {

    // ! Add An Edge :- O(1).
    public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    // ! Delete An Edge :- O(1).
    public static void deleteEdge(ArrayList<ArrayList<Integer>> adjList, int source, int destination) {
        adjList.get(source).remove(destination);
    }

    // ! Print The Graph.
    public static void printGraph(ArrayList<ArrayList<Integer>> adjList) {
        System.out.println("\nAdjacency List representation of Graph: ");

        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Adjacency List of vertex " + i);
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number Of Vertices In Your Graph :- ");
        int vertices = in.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.print("Enter The Number Of Edges In Your Graph :- ");
        int edges = in.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter The Value Of Source :- ");
            int source = in.nextInt();
            System.out.print("Enter The Value Of Destination :- ");
            int destination = in.nextInt();

            addEdge(adjList, source, destination);
        }

        printGraph(adjList);

        in.close();
    }
}
