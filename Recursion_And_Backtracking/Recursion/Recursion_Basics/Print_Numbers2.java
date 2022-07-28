/* Write A Recursive Function To Print Numbers From N to 1. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Print_Numbers2 {
    public static void main(String[] args) {
        printNum(5);
    }

    // T.C = O(n) & Space Complexity = O(n).
    public static void printNum(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNum(n - 1);
    }
}
