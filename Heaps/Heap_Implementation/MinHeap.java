package Heaps.Heap_Implementation;

import java.util.NoSuchElementException;

public class MinHeap {
    int[] arr;
    int size;

    MinHeap(int capacity) {
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
            if (arr[parent] > arr[index]) {
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
            int left_child = 2 * index;
            int right_child = 2 * index + 1;

            if (left_child < size && arr[index] > arr[left_child]) {
                int temp = arr[index];
                arr[index] = arr[left_child];
                arr[left_child] = temp;
                index = left_child;
            } else if (right_child < size && arr[index] > arr[right_child]) {
                int temp = arr[index];
                arr[index] = arr[right_child];
                arr[right_child] = temp;
                index = right_child;
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
        MinHeap heap = new MinHeap(15);
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
