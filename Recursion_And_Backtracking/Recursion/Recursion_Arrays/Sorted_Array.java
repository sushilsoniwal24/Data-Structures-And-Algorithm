/* Function To Check Whether An Array Is Sorted Or Not. */

package Recursion_And_Backtracking.Recursion.Recursion_Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7 };
        System.out.println(isSorted(arr, 0));
    }

    // T.C = O(n) & S.C = O(n).
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        if (arr[index] > arr[index + 1])
            return false;

        return isSorted(arr, index + 1);
    }
}
