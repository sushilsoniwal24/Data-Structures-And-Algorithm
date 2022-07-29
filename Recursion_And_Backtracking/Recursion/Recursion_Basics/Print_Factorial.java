/* Calculate The Factorial Of A Given Number. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Print_Factorial {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    // T.C = O(n) & S.C = O(n).
    public static int facto(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * facto(n - 1);
    }
}
