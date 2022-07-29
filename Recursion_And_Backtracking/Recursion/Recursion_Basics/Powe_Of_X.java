/* Calculate The Power Of a Given Number. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Powe_Of_X {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    // T.C = O(n) & S.C = O(n).
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

}
