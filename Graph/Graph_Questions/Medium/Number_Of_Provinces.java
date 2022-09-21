package Graph.Graph_Questions.Medium;

// ! Number of Provinces :- https://leetcode.com/problems/number-of-provinces/

import java.util.ArrayList;

public class Number_Of_Provinces {

    /**
     * * Method-01 :- Without Converting Matrix Into An ArrayList.
     * ! T.C. = O(n*n) => DFS.
     * ! S.C. = O(n) + O(n) => Visited Array & Recursion Stack
     */
    public static int findCircleNum1(int[][] adjMatrix) {
        int vertices = adjMatrix.length;

        // ! Array To Store History Of Visited Nodes.
        int[] visited = new int[vertices];
        int provinces = 0;
        for (int i = 0; i < vertices; i++) {
            if (visited[i] == 0) {
                dfs1(adjMatrix, visited, i, vertices);
                provinces++;
            }
        }
        return provinces;
    }

    // Todo :- DFS Traversal For A Vertex.
    private static void dfs1(int[][] adjMatrix, int[] visited, int i, int vertices) {
        for (int j = 0; j < vertices; j++) {
            if (adjMatrix[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs1(adjMatrix, visited, j, vertices);
            }
        }
    }
    // *---------------------------------------------------------------------------------

    /**
     * * Method-02 :- By Converting Matrix Into An List.
     * ! T.C. = O(n) + O(v + 2e) => Loop & DFS.
     * ! S.C. = O(n) + O(n) => Visited Array & Recursion Stack
     */
    public static int findCircleNum(int[][] adjMatrix) {
        int vertices = adjMatrix.length;

        // * Convert Adjacency Matrix Into An Adjacency List.
        ArrayList<ArrayList<Integer>> adjList = covertIntoList(adjMatrix, vertices);

        // ! Array To Store History Of Visited Nodes.
        int[] visited = new int[vertices];
        int provinces = 0;

        for (int i = 0; i < vertices; i++) {
            if (visited[i] == 0) {
                provinces++;
                dfs(i, adjList, visited);
            }
        }

        return provinces;
    }

    // Todo :- DFS Traversal For A Vertex.
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] visited) {
        visited[node] = 1;
        for (Integer num : adjList.get(node)) {
            if (visited[num] == 0) {
                dfs(num, adjList, visited);
            }
        }

    }

    // Todo :- Convert Matrix Into List.
    private static ArrayList<ArrayList<Integer>> covertIntoList(int[][] adjMatrix, int vertices) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (adjMatrix[i][j] == 1 && i != j) {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        // adjacency matrix
        int[][] adj = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };

        System.out.println(findCircleNum1(adj));
    }
}
