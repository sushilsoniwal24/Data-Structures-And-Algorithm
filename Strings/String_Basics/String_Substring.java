package Strings.String_Basics;

public class String_Substring {
    public static void main(String[] args) {
        printSub1("SushilSoniwal");
        printSub2("SushilSoniwal");
    }

    // (1) By using substring(int start).
    static void printSub1(String s) {
        System.out.println(s.substring(6));
    }
    // -----------------------------------------------------------------------------------

    // (2) By using substring(int start, int end).
    static void printSub2(String s) {
        System.out.println(s.substring(0, 6));
    }

}
