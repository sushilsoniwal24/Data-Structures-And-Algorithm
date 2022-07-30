/* Search A Target Element In A Rotated Sorted Array. */

package Recursion_And_Backtracking.Recursion.Recursion_Arrays;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int tar_idx = RBS(arr, 0, arr.length - 1, 5);
        System.out.println(tar_idx);
    }

    // T.C = O(logn) & S.C = O(n).
    public static int RBS(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid_idx = start + (end - start) / 2;

        if (arr[mid_idx] == target) {
            return mid_idx;
        }

        else if (arr[start] <= arr[mid_idx]) {
            if (target >= arr[start] && target < arr[mid_idx]) {
                return RBS(arr, start, mid_idx - 1, target);
            }
            return RBS(arr, mid_idx + 1, end, target);
        }

        else {
            if (target > arr[mid_idx] && target <= arr[end]) {
                return RBS(arr, mid_idx + 1, end, target);
            }
            return RBS(arr, start, mid_idx - 1, target);
        }
    }
}
