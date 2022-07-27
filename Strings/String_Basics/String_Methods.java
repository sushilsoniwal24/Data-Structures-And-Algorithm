package Strings.String_Basics;

public class String_Methods {

    public static void main(String[] args) {
        String s = "Sushil Soniwal";

        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.isEmpty());
        System.out.println(s.contains("hol"));
        System.out.println(s.replace('S', 'R'));
        System.out.println(s.indexOf("hil"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
    }

}
