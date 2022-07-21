package Arrays.Array_1D.Array_Basics;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of your array:- ");
        int size = in.nextInt();

        int[] arr = new int[size]; // 0-Based Index.

        System.out.println("Enter the elements of your array till the entered size");
        for (int index = 0; index < size; index++) {
            arr[index] = in.nextInt();
        }

        System.out.printf("Your array of size %d is:- ", size);
        for (int index = 0; index < size; index++) {
            System.out.print(arr[index] + " ");
        }

        in.close();

    }

}