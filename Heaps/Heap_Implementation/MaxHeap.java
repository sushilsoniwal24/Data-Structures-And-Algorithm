package Heaps.Heap_Implementation;

import java.util.NoSuchElementException;

public class MaxHeap {
    int[] arr;
    int size;

    MaxHeap(int capacity) {
        size = 0;
        arr = new int[capacity + 1];
        arr[0] = -1;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == arr.length);
    }

    /* Function To Insert An Element In Heap. */
    public void insert(int val) {
        if (isFull()) {
            throw new NoSuchElementException("Heap Is Full");
        }
        size = size + 1;
        int index = size;
        arr[index] = val;

        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            } else {
                return;
            }
        }
    }

    /* Function To Delete An Element From Heap. */
    public void delete() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap Is Empty");
        }

        /* Last Element At First Index. */
        arr[1] = arr[size];
        size--;

        int index = 1;
        while (index < size) {
            int left_child = arr[2 * index];
            int right_child = arr[2 * index + 1];
            int max_num = left_child > right_child ? 2 * index : 2 * index + 1;

            if (arr[index] < arr[max_num]) {
                int temp = arr[index];
                arr[index] = arr[max_num];
                arr[max_num] = temp;
                index = max_num;
            } else {
                return;
            }
        }
    }

    /* Function To Print The Heap. */
    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(15);
        heap.insert(30);
        heap.insert(40);
        heap.insert(10);
        heap.insert(20);
        heap.insert(70);
        heap.insert(60);
        heap.insert(100);
        heap.insert(50);

        heap.print();

        heap.delete();
        System.out.println("After Deleting An Element:- ");
        heap.print();
    }
}
