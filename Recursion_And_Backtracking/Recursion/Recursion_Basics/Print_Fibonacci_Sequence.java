/* Print Fibonacci Sequence Till The N'th Term. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Print_Fibonacci_Sequence {
    public static void main(String[] args) {
        fibSeq(7, 0, 1);
    }

    // T.C = O(n) & S.C = O(n).
    public static void fibSeq(int n, int a, int b) {
        if (n < 0) {
            return;
        }
        System.out.print(a + " ");
        fibSeq(n - 1, b, a + b);
    }
}
