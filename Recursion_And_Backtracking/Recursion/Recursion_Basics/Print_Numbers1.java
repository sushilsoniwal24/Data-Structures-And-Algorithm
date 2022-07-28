/* Write A Recursive Function To Print Numbers From 1 to N. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Print_Numbers1 {
    public static void main(String[] args) {
        printNum(5);
    }

    // T.C = O(n) & Space Complexity = O(n).
    public static void printNum(int n) {
        if (n == 0)
            return;
        printNum(n - 1);
        System.out.print(n + " ");
    }
}
