// Remove character 'S' from a given string.

package Recursion_And_Backtracking.Recursion.Recursion_Strings;

public class Skip_Character {
    public static void main(String[] args) {
        System.out.println(skipChar1("Sushil Soniwal", ""));
        System.out.println(skipChar2("Sushil Soniwal"));
    }

    /*
     * (1) By passing an "ans" string in parameters.
     * (2) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static String skipChar1(String str, String ans) {

        // Base case.
        if (str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);

        // Check for condition.
        if (ch == 's') {
            return skipChar1(str.substring(1), ans);
        }
        return skipChar1(str.substring(1), ans + ch);
    }
    /* ********************************************************** */

    /*
     * (1) By creating an "ans" string in function body.
     * (2) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static String skipChar2(String str) {

        // Base case.
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        // Check for condition.
        if (ch == 's') {
            return skipChar2(str.substring(1));
        }
        return ch + skipChar2(str.substring(1));
    }
}
