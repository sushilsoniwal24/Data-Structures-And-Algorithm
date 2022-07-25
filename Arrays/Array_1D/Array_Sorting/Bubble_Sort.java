package Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
        int[] arr = { 21, 3, 17, 13, 22, 4 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Bubble_Sort:- Repeatedly swap two adjacent elements if they are in wrong
     * order.
     * Stable Sorting Algorithm.
     * Time Complexity:- O(n^2) In Worst Case & O(n) In Best case.
     * Space Complexity :- O(1).
     */

    public static void sort(int[] arr) {
        int n = arr.length;

        // Outer Loop For No. Of Passes.
        for (int pass = 0; pass < n - 1; pass++) {
            boolean isSwapped = false;
            // Inner Loop For Comparison & swapping
            for (int index = 0; index < n - pass - 1; index++) {
                if (arr[index] > arr[index + 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break; // Array Is Now Sorted, No Need To Check Further.
            }
        }
    }
}