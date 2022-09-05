package Heaps.Heap_Implementation;

public class Heapify_Algo {

    /* Method To Create A Max-Heap. */
    public static void maxHeap(int[] arr, int len, int index) {
        int largest = index;
        int left_child = 2 * index;
        int right_child = 2 * index + 1;

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
            maxHeap(arr, len, largest);
        }
    }

    /* Method To Create A Max-Heap. */
    public static void minHeap(int[] arr, int len, int index) {
        int smallest = index;
        int left_child = 2 * index;
        int right_child = 2 * index + 1;

        if (left_child < len && arr[left_child] < arr[smallest]) {
            smallest = left_child;
        }

        if (right_child < len && arr[right_child] < arr[smallest]) {
            smallest = right_child;
        }

        if (smallest != index) {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;
            maxHeap(arr, len, smallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { -1, 54, 53, 55, 52, 50 };
        int n = arr.length;

        /* Max Heap */
        for (int i = n / 2; i > 0; i--) {
            maxHeap(arr, n, i);
        }

        System.out.println("MaxHeap Is:- ");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        /* Min Heap */
        for (int i = n / 2; i > 0; i--) {
            minHeap(arr, n, i);
        }

        System.out.println("MinHeap Is:- ");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
