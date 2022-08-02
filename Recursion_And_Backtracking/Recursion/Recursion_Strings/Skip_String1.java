// Skip the string that starts with "Brown".

package Recursion_And_Backtracking.Recursion.Recursion_Strings;

public class Skip_String1 {
    public static void main(String[] args) {
        System.out.println(skipStr1("That Greedy Brown Fox Is Hungry", ""));
        System.out.println(skipStr2("That Greedy Brown Fox Is Hungry"));
    }

    /*
     * (1) By passing an "ans" string in parameters.
     * (2) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static String skipStr1(String str, String ans) {

        // Base Case.
        if (str.isEmpty()) {
            return ans;
        }

        // Skip The String.
        if (str.startsWith("Brown")) {
            return skipStr1(str.substring(5), ans);
        }

        return skipStr1(str.substring(1), ans + str.charAt(0));
    }
    /* ********************************************************************** */

    /*
     * (1) By passing an "ans" string in function body.
     * (2) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static String skipStr2(String str) {

        // Base Case.
        if (str.isEmpty()) {
            return "";
        }

        // Skip The String.
        if (str.startsWith("Brown")) {
            return skipStr2(str.substring(5));
        }

        return str.charAt(0) + skipStr2(str.substring(1));
    }
}
