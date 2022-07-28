package Strings.String_Questions;

public class Palindrome_String {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome2(str));

    }

    // Method - 01 => Time Complexity = O(n) & Space Complexity = O(n).
    public static boolean isPalindrome1(String str) {
        int str_len = str.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (str_len >= 0) {
            sb.append(str.charAt(str_len));
            str_len--;
        }

        String rev_str = sb.toString();

        if (str == rev_str) {
            return true;
        } else {
            return false;
        }
    }
    /* ***************************************************************** */

    // Method - 01 => Time Complexity = O(n) & Space Complexity = O(1).
    public static boolean isPalindrome2(String str) {
        int start = 0, end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
