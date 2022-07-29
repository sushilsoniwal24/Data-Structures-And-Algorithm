/* Calculate The Number Of 0's In A Given Number. */

package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Count_Zeros {
    public static void main(String[] args) {
        System.out.println(countZeros(400340, 0));
    }

    // T.C = O(n) & S.C = O(n).
    public static int countZeros(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0)
            return countZeros(num / 10, count + 1);
        return countZeros(num / 10, count);
    }
}
