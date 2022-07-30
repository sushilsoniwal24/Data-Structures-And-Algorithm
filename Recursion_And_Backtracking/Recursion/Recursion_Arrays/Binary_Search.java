/* Binary Search Using Recursion. */

package Recursion_And_Backtracking.Recursion.Recursion_Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = { 14, 28, 42, 56, 70, 84, 98, 112, 126, 140 };
        int tar_idx = binarySearch(arr, 0, arr.length - 1, 112);
        System.out.println(tar_idx);
    }

    // T.C = O(logn) & S.C = O(n).
    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid_idx = start + (end - start) / 2;

        if (arr[mid_idx] == target)
            return mid_idx;
        if (arr[mid_idx] > target)
            return binarySearch(arr, start, mid_idx - 1, target);
        return binarySearch(arr, mid_idx + 1, end, target);
    }
}
