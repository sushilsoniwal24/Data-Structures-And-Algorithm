package Recursion_And_Backtracking.Recursion.Recursion_Basics;

public class Product_of_Digits {
    public static void main(String[] args) {
        System.out.println(digitProduct(4134));
    }

    // T.C = O(n) & S.C = O(n).
    public static int digitProduct(int num) {
        int rem = num % 10; // remainder.
        if (rem == num) {
            return num;
        }
        return (rem * digitProduct(num / 10));
    }
}
