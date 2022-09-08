package Heaps.Heap_Implementation;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(10);
        pq.add(9);

        System.out.println(pq.size());
        System.out.println(pq);

        while (!pq.isEmpty()) {
            pq.peek();
            System.out.println(pq.poll());
        }
    }

}
