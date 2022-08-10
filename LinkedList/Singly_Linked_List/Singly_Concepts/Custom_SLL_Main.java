package LinkedList.Singly_Linked_List.Singly_Concepts;

public class Custom_SLL_Main {
    public static void main(String[] args) {
        Custom_Singly_LinkedList list = new Custom_Singly_LinkedList();

        /* ********** INSERTION IN SINGLY LINKED LIST ********** */
        System.out.print("List after inserting at first position:- ");
        list.insertFirst(50);
        list.insertFirst(30);
        list.insertFirst(22);
        list.insertFirst(14);
        list.insertFirst(13);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after inserting at last position:- ");
        list.insertLast(3);
        list.insertLast(5);
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after inserting at given position:- ");
        list.insert(2, 2);
        list.display();
        System.out.println("The size is:- " + list.size);

        /* ********** DELETION IN SINGLY LINKED LIST ********** */
        System.out.print("list after deleting the first node:- ");
        list.deleteFirst();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after deleting the last node:- ");
        list.deleteLast();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("List after deleting the node of a given index:- ");
        list.delete(2);
        list.display();
        System.out.println("The size is:- " + list.size);

        // System.out.println(list.find(30));
    }
}
