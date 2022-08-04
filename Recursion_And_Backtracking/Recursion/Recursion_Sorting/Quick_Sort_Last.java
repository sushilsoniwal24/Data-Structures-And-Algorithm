package Recursion_And_Backtracking.Recursion.Recursion_Sorting;

import java.util.Arrays;

public class Quick_Sort_Last {
    public static void main(String[] args) {

        int[] arr = { 4, 35, 12, 56, 12 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high); // Correct index of our pivot.

            // Recursive call for left side of pivot.
            quickSort(arr, low, pi - 1);

            // Recursive call for right side of pivot.
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // Last element as pivot.

        int i = low - 1; // Initially no element is smaller than pivot.

        // Compare all the elements with pivot.
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swapping element at i with element at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element with the greater element specified by i
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // Right index of pivot.
    }

}
