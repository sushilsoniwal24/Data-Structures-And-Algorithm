package Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 2, 7, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Selection_Sort:- Take Minimum Element From Unsorted Array & Place It At The
     * Beginning Of The Unsorted Array..
     * Not A Stable Sorting Algorithm.
     * Time Complexity:- O(n^2) In Both Best & Worst Case.
     * Space Complexity :- O(1).
     */

    public static void sort(int[] arr) {
        int size = arr.length;

        for (int pass = 0; pass < size - 1; pass++) {
            int min_idx = pass;
            for (int index = pass + 1; index < size; index++) {
                // Select Minimum In Every Loop.
                if (arr[index] < arr[min_idx]) {
                    min_idx = index;
                }
            }
            // Put Minimum Ai The Correct Position.
            int temp = arr[pass];
            arr[pass] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
}
