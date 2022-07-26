package Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 4, 7 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Insertion_Sort:- Pick An Element From Unsorted Array, Place It At
     * Correct Position and Shifts Other Elements Accordingly.
     * Stable Sorting Algorithm.
     * Time Complexity:- O(n^2) In Worst Case & O(n) In Best Case.
     * Space Complexity :- O(1).
     */

    public static void sort(int[] arr) {
        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current; // Place Current At Its Right Position.
        }
    }
}
