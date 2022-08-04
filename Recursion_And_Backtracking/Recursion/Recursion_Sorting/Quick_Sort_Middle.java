package Recursion_And_Backtracking.Recursion.Recursion_Sorting;

import java.util.Arrays;

public class Quick_Sort_Middle {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 11, 45, 67, 23 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Quick Sort:- Sort An Array By Partition.
     * T.C:- O(n*log(n)).
     * S.C:- O(n).
     */

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low, end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot)
                start++;
            while (arr[end] > pivot)
                end--;

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
