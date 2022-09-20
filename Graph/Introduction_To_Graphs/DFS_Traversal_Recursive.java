package Graph.Introduction_To_Graphs;

import java.util.ArrayList;

public class DFS_Traversal_Recursive {

    /**
     * Todo: DFS Of Graph => https://bit.ly/3RN3vbM
     * ! Time Complexity = O(N) + O(2E).
     * ! Space Complexity = O(3N)
     */

    public static ArrayList<Integer> dfsOfGraph(int vertices, ArrayList<ArrayList<Integer>> adj) {

        // ! ArrayList To Store DFS Traversal.
        ArrayList<Integer> dfs = new ArrayList<Integer>();

        // ! Boolean Array To Store History Of Visited Nodes.
        boolean[] visited = new boolean[vertices + 1]; // * 1-Based Indexing

        for (int i = 1; i <= vertices; i++) {
            if (!visited[i]) {
                dfsTraversal(i, visited, adj, dfs);
            }
        }

        return dfs;
    }

    // ? Method For DFS Traversal For A Vertex.
    private static void dfsTraversal(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj,
            ArrayList<Integer> dfs) {
        dfs.add(node);
        visited[node] = true;

        for (Integer num : adj.get(node)) {
            if (!visited[num]) {
                dfsTraversal(num, visited, adj, dfs);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(1).add(5);
        adj.get(2).add(4);
        adj.get(2).add(1);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(2);
        adj.get(5).add(1);

        ArrayList<Integer> ans = dfsOfGraph(5, adj);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
