package Heaps.Heap_Questions;

import java.util.PriorityQueue;

/* Minimum Cost Of Ropes  :-  https://bit.ly/3RxUQK2 */

public class Min_Cost_Ropes {

    /* T.C = O(n*logn) & S.C = O(n). */
    public static long minCost(long arr[], int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        long ans = 0;
        while (pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            ans += (first + second);
            pq.add(first + second);
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = { 4, 3, 2, 6 };
        System.out.println(minCost(arr, 4));
    }
}
