package LinkedList.Doubly_Linked_List.Doubly_Concepts;

public class Custom_Doubly_LinkedList {

    public Node head;
    public int size;

    public Custom_Doubly_LinkedList() {
        size = 0;
    }

    /* ********** INSERTION IN DOUBLY LINKED LIST ********** */

    // (1) Insert At First Position.
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    // (2) Insert At Last Position.
    public void insertLast(int val) {
        Node node = new Node(val);

        // If List Is Empty.
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }

    // (3) Insert At A Target Index.
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        node.prev = temp;
        size++;
    }

    /* ********** METHOD TO DISPLAY SINGLY LINKED LIST ********** */
    public void display() {
        Node temp = head;
        System.out.print("End");
        while (temp != null) {
            System.out.print("<-" + temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    /* ********** DELETION IN DOUBLY LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        size--;
    }

    // (3) Delete the node of a target index.
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}