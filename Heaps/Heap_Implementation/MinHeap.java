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

        int i = 1;
        while (i < size) {
            int left = 2 * i;
            int right = 2 * i + 1;

            if (left < size && arr[i] > arr[left]) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                i = left;
            } else if (right < size && arr[i] > arr[right]) {
                int temp = arr[i];
                arr[i] = arr[right];
                arr[right] = temp;
                i = right;
            } else {
                return;
            }
        }
    }

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

        heap.print();

        heap.delete();
        System.out.println("After Deleting An Element:- ");
        heap.print();
    }
}
