package Recursion_And_Backtracking.Recursion.Recursion_Subset_Subsequence;

public class Possible_Subsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        subSet(arr, 0, 0);
    }

    public static void subSet(int[] arr, int start, int end) {
        if (end == arr.length)
            return;
        if (start > end)
            subSet(arr, 0, end + 1);
        else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[end] + "]");
            subSet(arr, start + 1, end);
        }
    }

}
