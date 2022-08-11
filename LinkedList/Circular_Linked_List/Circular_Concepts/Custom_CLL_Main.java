package LinkedList.Circular_Linked_List.Circular_Concepts;

public class Custom_CLL_Main {
    public static void main(String[] args) {

        Custom_Circular_LinkedList list = new Custom_Circular_LinkedList();

        /* ********** INSERTION IN CIRCULAR LINKED LIST ********** */
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
        list.insert(92, 0);
        list.insert(82, 8);
        list.insert(72, 4);
        list.display();
        System.out.println("The size is:- " + list.size);

        /* ********** DELETION IN CIRCULAR LINKED LIST ********** */
        System.out.print("list after deleting the first node:- ");
        list.deleteFirst();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("list after deleting the last node:- ");
        list.deleteLast();
        list.display();
        System.out.println("The size is:- " + list.size);

        System.out.print("list after deleting the desired node:- ");
        list.delete(3);
        list.display();
        System.out.println("The size is:- " + list.size);

    }
}
