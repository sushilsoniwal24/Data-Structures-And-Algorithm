package Heaps.Heap_Questions;

import java.util.PriorityQueue;

/* K-th Largest Sum Contiguous Subarray :- https://bit.ly/3B9bYz7 */

public class Kth_Largest_Sum_Subarray {

    /* T.C = O(n^2 * logk) & S.C = O(k) */
    public static int kthLargest(int n, int k, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                pq.add(sum);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        int n = arr.length;
        int k = 2;
        System.out.println(kthLargest(n, k, arr));
    }
}
