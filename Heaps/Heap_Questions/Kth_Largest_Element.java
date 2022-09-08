package Heaps.Heap_Questions;

import java.util.PriorityQueue;

/* Kth Largest Element in an Array :- https://bit.ly/3TOizay */

public class Kth_Largest_Element {

    /* T.C. = O(n*logk) & S.C. = O(k). */
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 90, 15, 10, 7, 12, 2 };
        int k = 3;
        System.out.println(findKthLargest(arr, k));
    }
}
