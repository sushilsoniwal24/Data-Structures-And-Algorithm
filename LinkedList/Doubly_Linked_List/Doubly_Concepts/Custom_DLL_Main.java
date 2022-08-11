package LinkedList.Doubly_Linked_List.Doubly_Concepts;

public class Custom_DLL_Main {
    public static void main(String[] args) {

        Custom_Doubly_LinkedList list = new Custom_Doubly_LinkedList();

        /* ********** INSERTION IN DOUBLY LINKED LIST ********** */
        System.out.print("List after inserting at first position:- ");
        list.insertFirst(1);
        list.insertFirst(12);
        list.insertFirst(33);
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

        /* ********** DELETION IN DOUBLY LINKED LIST ********** */
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

    }
}
