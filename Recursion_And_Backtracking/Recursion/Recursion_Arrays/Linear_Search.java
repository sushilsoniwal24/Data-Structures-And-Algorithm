/* Linear Search in An Array using Recursion. */

package Recursion_And_Backtracking.Recursion.Recursion_Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 7, 9, 3, 4, 2, 6 };
        int target_idx = linearSearch(arr, 0, 12);
        System.out.println(target_idx);
    }

    // T.C = O(n) & S.C = O(n).
    public static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target)
            return index;
        return linearSearch(arr, index + 1, target);
    }
}
