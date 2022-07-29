/* Calculate The Sum Of All The Digits Of A Given Number. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println(digitSum(4034));
    }

    // T.C = O(n) & S.C = O(n).
    public static int digitSum(int num) {
        int rem = num % 10; // remainder.
        if (rem == num) {
            return num;
        }
        return (rem + digitSum(num / 10));
    }
}
