package Graph.Introduction_To_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal {

    /**
     * Todo: BFS Of Graph => https://bit.ly/3BPEuY5
     * ! Time Complexity = O(N) + O(2E).
     * ! Space Complexity = O(3N)
     */
    public ArrayList<Integer> bfsOfGraph(int vertices, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            bfs.add(node);

            for (Integer e : adj.get(node)) {
                if (visited[e] == false) {
                    visited[e] = true;
                    queue.add(e);
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        BFS_Traversal graph = new BFS_Traversal();
        ArrayList<Integer> sol = graph.bfsOfGraph(5, adj);

        for (int i = 0; i < sol.size(); i++) {
            System.out.print(sol.get(i) + " ");
        }
    }
}
