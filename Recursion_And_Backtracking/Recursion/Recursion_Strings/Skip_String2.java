//  Skip a string that starts with "Bro" but not with "Brown" from a given string.

package Recursion_And_Backtracking.Recursion.Recursion_Strings;

public class Skip_String2 {
    public static void main(String[] args) {
        String str = "The Lazy And Week Brown Fox Is My Bro";
        System.out.println(skip1(str, ""));
        System.out.println(skip2(str));
    }

    /*
     * (1) By passing an "ans" string in parameters.
     * (2) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static String skip1(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if ((str.startsWith("Bro")) && !(str.startsWith("Brown"))) {
            return skip1(str.substring(3), ans);
        }
        return skip1(str.substring(1), ans + str.charAt(0));
    }
    /* ******************************************************************* */

    /*
     * (1) By passing an "ans" string in function body.
     * (2) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static String skip2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if ((str.startsWith("Bro")) && !(str.startsWith("Brown"))) {
            return skip2(str.substring(3));
        }
        return (str.charAt(0) + skip2(str.substring(1)));
    }
}
