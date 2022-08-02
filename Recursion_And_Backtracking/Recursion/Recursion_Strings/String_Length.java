// Calculate the length of a given string using recursion.

package Recursion_And_Backtracking.Recursion.Recursion_Strings;

public class String_Length { 
    public static void main(String[] args) {
        int length = strLen("Sushil",0);
        System.out.println(length);
    }

    // Time Complexity = O(n) & Space Complexity = O(n).
    public static int strLen(String str, int len) {
        if (str.isEmpty()) {
            return len;
        }
        return strLen(str.substring(1), len + 1);
    }

}
