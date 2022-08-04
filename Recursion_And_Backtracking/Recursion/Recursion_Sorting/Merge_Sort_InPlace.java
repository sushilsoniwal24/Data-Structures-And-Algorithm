package Recursion_And_Backtracking.Recursion.Recursion_Sorting;

import java.util.Arrays;

public class Merge_Sort_InPlace {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 45, 13, 67, 10, 35, 44, 100 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    /* Merge Function To Merge Two Arrays. */
    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        /* Modifying Original Array. */
        for (int index = start; index <= end; index++) {
            arr[index] = temp[index - start];
        }
    }
}
