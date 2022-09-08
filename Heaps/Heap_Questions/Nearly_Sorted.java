package Heaps.Heap_Questions;

import java.util.ArrayList;
import java.util.PriorityQueue;

/* Nearly sorted :- https://bit.ly/3D6DLmc */

public class Nearly_Sorted {

    /* T.C = O(n*logk) & S.C = O(n). */
    public static ArrayList<Integer> nearlySorted(int arr[], int num, int k) {
        ArrayList<Integer> sol = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                sol.add(pq.poll());
            }
        }

        while (!pq.isEmpty()) {
            sol.add(pq.poll());
        }

        return sol;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
        System.out.println(nearlySorted(arr, 7, 3));
    }
}
