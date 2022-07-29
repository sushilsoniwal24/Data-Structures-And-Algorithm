/* Calculate The N'th Fibonacci Number. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Print_Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println(fibNum(50));
    }

    // T.C = O(n) & S.C = O(n).
    public static int fibNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibNum(n - 1) + fibNum(n - 2);
    }
}
