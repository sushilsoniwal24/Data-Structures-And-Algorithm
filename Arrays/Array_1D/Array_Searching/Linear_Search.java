package Arrays.Array_1D.Array_Searching;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 2, 3, 1, 6 };
        int idx = search(arr, 2);
        System.out.println(idx);
    }

    // Time Complexity = O(n) & Space Complexity = O(1).
    public static int search(int[] arr, int target) {
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            if (arr[index] == target)
                return index;
        }
        return -1;// Target Not Found
    }
}
