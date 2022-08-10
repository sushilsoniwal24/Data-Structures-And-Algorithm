package LinkedList.Singly_Linked_List.Singly_Concepts;

import java.util.LinkedList;

public class Collection_LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // (1) Insert At First Position.
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(2);
        System.out.println(list);

        // (2) Insert At Last Position.
        list.addLast(12);
        list.addLast(10);
        list.addLast(15);
        System.out.println(list);

        // (3) Insert At A Target Index.
        list.add(3, 50);
        System.out.println(list);

        // (1) Delete First Node.
        list.removeFirst();
        System.out.println(list);

        // (2) Delete Last Node.
        list.removeLast();
        System.out.println(list);

        // (3) Delete The Node Of A Target Index.
        list.remove(3);
        System.out.println(list);
    }
}
