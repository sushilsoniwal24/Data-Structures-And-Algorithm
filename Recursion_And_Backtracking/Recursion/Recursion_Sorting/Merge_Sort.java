package Recursion_And_Backtracking.Recursion.Recursion_Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 45, 12, 67, 34, 15};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

/**
 * Merge Sort:- Divide array into two halves, Sort Both & Merge Them.
 * T.C:- O(n*log(n)).
 * S.C:- O(n).
 */

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k++] = first[i++];
            } else {
                ans[k++] = second[j++];
            }
        }

        while (i < first.length) {
            ans[k++] = first[i++];
        }

        while (j < second.length) {
            ans[k++] = second[j++];
        }

        return ans;
    }
}