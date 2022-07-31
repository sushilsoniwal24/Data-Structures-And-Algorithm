/* Return All The Occurences Of A Target Element In An Given Array. */

package Recursion_And_Backtracking.Recursion.Recursion_ArrayList;

import java.util.ArrayList;

public class Linear_Search_Multiple_Occurences {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 6, 5, 7, 8, 5, 5, 2 };

        // search1(arr, 0, 5);
        // System.out.println(list);

        // ArrayList<Integer> ans = search2(arr, 0, 5, new ArrayList<>());
        // System.out.println(ans);

        System.out.println(search3(arr, 0, 5));
    }

    /*
     * (1) By Creating An Static ArrayList Outside The Function Body.
     * (2) Whenever We'll Made Any Change In This List Inside The Function Body, It
     * Will Automatically Reflected In The Outside Created List.
     * (3) Time Complexity = O(n) & Space Complexity = O(n).
     */

    static ArrayList<Integer> list = new ArrayList<>();

    public static void search1(int[] arr, int index, int target) {
        if (index == arr.length)
            return;
        if (arr[index] == target)
            list.add(index);
        search1(arr, index + 1, target);
    }
    // ------------------------------------------------------------------------------------------------------

    /*
     * (1) By Passing An ArrayList In The Parameters Of The Function Body.
     * (2) In This Way The List Will Be Avalible For Every Function Call.
     * (3) Whenever We'll Made Any Change In This List Inside The Function Body, The
     * Original List Will Also Be Modified, Because Multiple Reference Variables But
     * Pointing To The Same Object.
     * (4) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static ArrayList<Integer> search2(int[] arr, int index, int target, ArrayList<Integer> ansList) {
        if (index == arr.length)
            return ansList;
        if (arr[index] == target)
            ansList.add(index);
        return search2(arr, index + 1, target, ansList);
    }
    // ------------------------------------------------------------------------------------------------------

    /*
     * (1) By Passing An ArrayList In The Function Body.
     * (2) In This Way For Every New Function Call A New List Will Be Created.
     * (3) Whenever Changes Been Made Via A Function Call, It Will Be Avalible Fot
     * That Function Call Only.
     * (4) We Have To Combine All The Answers To Get The Actual Answer.
     * (5) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static ArrayList<Integer> search3(int[] arr, int index, int target) {
        ArrayList<Integer> ansList = new ArrayList<>();
        if (index == arr.length)
            return ansList;
        if (arr[index] == target)
            ansList.add(index);

        ArrayList<Integer> ansFromBelowCalls = search3(arr, index + 1, target);
        ansList.addAll(ansFromBelowCalls);
        return ansList;
    }
}