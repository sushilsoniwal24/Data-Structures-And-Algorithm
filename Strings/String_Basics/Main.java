package Strings.String_Basics;

public class Main {

    public static void main(String[] args) {

        // 2-Ways to create string objects.

        // (1) Using String Literal:- Object will be created in string pool.
        String str1 = "Sushil";

        // (2) Using New Keyword:- Object will be created outside string pool.
        String str2 = new String("Sushil");

        System.out.println(str1);
        System.out.println(str2);

        // String As A Character Array.
        char[] ch = { 'J', 'A', 'V', 'A' };
        String s = new String(ch);
        System.out.println(s);

    }
}