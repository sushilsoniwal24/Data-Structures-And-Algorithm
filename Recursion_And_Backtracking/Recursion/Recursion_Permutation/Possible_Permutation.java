package Recursion_And_Backtracking.Recursion.Recursion_Permutation;

import java.util.ArrayList;

public class Possible_Permutation {
    public static void main(String[] args) {
        permutations1("", "ABC");
        System.out.println(permutations2("", "ABC"));
    }

    /*
     * Print all the possible permutations of a given string.
     * Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static void permutations1(String ans, String str) {

        // Base Case.
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);

        // At every recursive level we have total (ans.length()+1) recursive calls.
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            permutations1(first + ch + second, str.substring(1));
        }
    }
    /* ************************************************************ */

    /*
     * Return all the possible permutations of a given string in an ArrayList.
     * Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static ArrayList<String> permutations2(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> local = new ArrayList<>();

        // At every recursive level we have total (ans.length()+1) recursive calls.
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            local.addAll(permutations2((first + ch + second), str.substring(1)));
        }
        return local;
    }

}
