package Strings.String_Basics;

public class String_Buffer {
    public static void main(String[] args) {
        SBC();
        SBM();
    }

    // StringBuffer Constructors.
    public static void SBC() {
        StringBuffer sbc1 = new StringBuffer();
        StringBuffer sbc2 = new StringBuffer("Sushil");
        StringBuffer sbc3 = new StringBuffer(20);

        System.out.println("The Default size of StringBuffer is:- " + sbc1.capacity());
        System.out.println("The initial value of StringBuffer is:- " + sbc2);
        System.out.println("The initial size of StringBuffer is:- " + sbc3.capacity());
    }
    // -----------------------------------------------------------------------------------------------------

    // StringBuffer Methods.
    public static void SBM() {
        StringBuffer sb = new StringBuffer("Sushil");
        System.out.println(sb.append("JAVA"));
        System.out.println(sb.insert(2, "CPP"));
        System.out.println(sb.replace(1, 3, "PYTHON"));
        System.out.println(sb.delete(1, 3));
        System.out.println(sb.reverse());
    }

}
