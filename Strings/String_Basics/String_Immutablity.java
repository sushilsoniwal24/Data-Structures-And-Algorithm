package Strings.String_Basics;

public class String_Immutablity {
    public static void main(String[] args) {

        String s = "Sushil";
        s.concat("Soniwal");
        System.out.println(s);

        // Output => "Sushil";
        // A new object "Sushil Soniwal" is created in pool but 's' still refers to old
        // one i.e. "Sushil".

        String str = "Sushil";
        str = str.concat("Soniwal");
        System.out.println(str);

        // Output => "SushilSoniwal";
        // A new object "Sushil Soniwal" is created in pool and 's' refer to new one
        // i.e. "SushilSoniwal".
    }
}
