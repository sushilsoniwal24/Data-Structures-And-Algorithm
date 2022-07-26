package Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] a1 = { 5, 4, 3, 2, 1 };
        sort1(a1);
        System.out.println(Arrays.toString(a1));

        int[] a2 = { 4, 3, 2, 1, 0 };
        sort2(a2);
        System.out.println(Arrays.toString(a2));
    }

    /**
     * Cyclic_Sort:- Swap Element With His Correct Position.
     * Unstable Sorting Algorithm.
     * Time Complexity:- O(n).
     * Space Complexity :- O(1).
     */

    // Array Range = [1 - N] .
    public static void sort1(int[] arr) {
        int size = arr.length;
        int index = 0;

        while (index < size) {
            int cor_idx = arr[index] - 1;
            if (arr[index] != arr[cor_idx]) {
                swap(arr, index, cor_idx);
            } else {
                index++;
            }
        }
    }

    // Array Range = [0 - N] .
    public static void sort2(int[] arr) {
        int size = arr.length;
        int index = 0;

        while (index < size) {
            int cor_idx = arr[index];
            if (arr[index] != arr[cor_idx]) {
                swap(arr, index, cor_idx);
            } else {
                index++;
            }
        }
    }

    // Swap Two Numbers Of An Array.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
