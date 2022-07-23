package Arrays.Array_1D.Array_Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 9, 12, 15 };
        int idx = search(arr, 22);
        System.out.println(idx);
    }

    // Time Complexity = O(logn) & Space Complexity = O(1)/
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If middle element is our target element.
            if (arr[mid] == target)
                return mid;

            // If middle is greater than target.
            else if (arr[mid] > target)
                end = mid - 1;

            // If middle is less than target.
            else
                start = mid + 1;
        }

        return -1; // Target Not Found.
    }
}
