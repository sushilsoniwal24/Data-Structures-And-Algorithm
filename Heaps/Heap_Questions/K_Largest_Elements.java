package Heaps.Heap_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/* K largest elements:- https://bit.ly/3L2YZTZ */

public class K_Largest_Elements {

    /* T.C. = O(n*logk) & S.C. = O(k). */
    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        ArrayList<Integer> sol = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            sol.add(pq.poll());
        }
        Collections.reverse(sol);
        return sol;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 787, 1, 23 };
        int n = arr.length;
        int k = 2;
        System.out.println(kLargest(arr, n, k));
    }
}
