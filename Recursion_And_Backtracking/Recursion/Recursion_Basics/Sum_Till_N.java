/* Calculate Sum Till A Given Number N. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Sum_Till_N {
    public static void main(String[] args) {
        System.out.println(sumOfN1(6));
        sumOfN2(6, 0);
    }

    /*
     * (1) Return The Sum.
     * T.C = O(n) & S.C = O(n).
     */

    public static int sumOfN1(int n) {

        // Base Condition.
        if (n == 0) {
            return 0;
        }
        return n + sumOfN1(n - 1); // Recursive Call.
    }
    /* ********************************************************** */

    /*
     * Print The Sum.
     * T.C = O(n) & S.C = O(n).
     */

    public static void sumOfN2(int n, int sum) {

        // Base Condition.
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sumOfN2(n - 1, sum + n); // Recursive Call.
    }
}
