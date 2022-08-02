/* Write A Recursive Function To Check Whether A Given String Is Palindrome Or Not. */

package Recursion_And_Backtracking.Recursion.Recursion_Strings;

public class Palindrome_String {
    public static void main(String[] args) {
        String str = "Racecar";
        int n = str.length();
        System.out.println(isPalindrome(str, 0, n - 1));
    }

    // Time Complexity = O(n) & Space Complexity = O(n).
    public static boolean isPalindrome(String str, int start, int end) {
        if (start == end)
            return true;
        if (str.charAt(start) == str.charAt(end))
            return isPalindrome(str, start + 1, end - 1);
        return false;
    }
}
