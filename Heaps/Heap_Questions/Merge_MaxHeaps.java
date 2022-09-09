package Heaps.Heap_Questions;

import java.util.Arrays;

/* Merge two binary Max heaps :- https://bit.ly/3d81IyO */

public class Merge_MaxHeaps {

    /* T.C = O(n+m) & S.C = O(n+m). */
    public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int size = n + m;
        int[] ans = new int[size];
        int idx = 0;

        for (int i : a) {
            ans[idx++] = i;
        }
        for (int i : b) {
            ans[idx++] = i;
        }

        for (int index = size / 2 - 1; index >= 0; index--) {
            heapify(ans, size, index);
        }

        return ans;
    }

    /* Heapify Function To Build Max Heap. */
    private static void heapify(int[] arr, int len, int index) {
        int largest = index;
        int left_child = 2 * index + 1;
        int right_child = 2 * index + 2;

        if (left_child < len && arr[left_child] > arr[largest]) {
            largest = left_child;
        }

        if (right_child < len && arr[right_child] > arr[largest]) {
            largest = right_child;
        }

        if (largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr, len, largest);
        }
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 6, 2 };
        int[] b = { 12, 7, 9 };

        int[] sol = mergeHeaps(a, b, 4, 3);
        System.out.println(Arrays.toString(sol));
    }
}
