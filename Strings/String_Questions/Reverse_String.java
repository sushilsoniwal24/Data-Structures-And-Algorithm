package Strings.String_Questions;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "sushil";
        String rev_str = reverse(str);
        System.out.println(rev_str);
    }

    // Time Complexity = O(n) & Space Complexity = O(n).
    public static String reverse(String str) {
        int str_len = str.length()-1;
        StringBuilder sb = new StringBuilder();

        while (str_len >= 0) {
            sb.append(str.charAt(str_len));
            str_len--;
        }

        return sb.toString();
    }
}
