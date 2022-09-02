package Hashing.Hashsets;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add Elements.
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(6);
        set.add(4);

        // Print Set.
        System.out.println("The Values In Set Is:- " + set);

        // Size Of A HashSet.
        System.out.println("The Size Of Set is:- " + set.size()); // 5 No Duplicates.

        // Search In A HashSet.
        if (set.contains(5)) {
            System.out.println("Exist");
        }

        if (!set.contains(3)) {
            System.out.println("Not Exist");
        }

        // Delete In A HashSet.
        set.remove(5);
        if (!set.contains(5)) {
            System.out.println("Deleted");
        }

        /* Iteration :- It doesn't have an order. */
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        /* IsEmpty. */
        if (!set.isEmpty()) {
            System.out.println("The Set Is Not Empty");
        }
    }
}
