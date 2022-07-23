package Arrays.Array_1D.Array_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        met1();
        met2();
    }

    /* 2 ways to declare & initialize array. */

    // ********** Method-01 **********
    public static void met1() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your array:- ");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of your array till the entered size");
        for (int index = 0; index < size; index++) {
            arr[index] = in.nextInt();
        }

        System.out.printf("Your array of size %d is:- ", size);
        for (int index = 0; index < size; index++) {
            System.out.print(arr[index] + " ");
        }

        // Line Break.
        System.out.println();

        in.close();
    }

    // ********** Method-02 **********
    public static void met2() {
        int[] arr = { 1, 2, 3 };

        System.out.print("Your array is:- ");
        System.out.println(Arrays.toString(arr));
    }

}