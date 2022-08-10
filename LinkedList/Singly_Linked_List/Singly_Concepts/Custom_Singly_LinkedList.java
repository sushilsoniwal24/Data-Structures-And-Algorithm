package LinkedList.Singly_Linked_List.Singly_Concepts;

public class Custom_Singly_LinkedList {

    public Node head;
    public int size;

    public Custom_Singly_LinkedList() {
        size = 0;
    }

    /* ********** INSERTION IN SINGLY LINKED LIST ********** */

    // (1) Insert At First Position.
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size += 1;
    }

    // (2) Insert At Last Position.
    public void insertLast(int val) {
        Node node = new Node(val);

        // If List Is Already Empty.
        if (head == null) {
            insertFirst(val);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size += 1;
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
        size += 1;
    }

    /* ********** METHOD TO DISPLAY SINGLY LINKED LIST ********** */
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    /* ********** DELETION IN SINGLY LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        // If List Is Empty.
        if (head == null) {
            System.out.println("Nothing To Delete");
            return;
        }

        head = head.next;
        size -= 1;
    }

    // (2) Delete Last Node.
    public void deleteLast() {

        // If List Is Empty.
        if (head == null) {
            System.out.println("Nothing To Delete");
            return;
        }

        // If list has only one node.
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // (3) Delete The Node Of A Target Index.
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

    /* ********** FIND THE TARGET NODE ********** */
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Not Found
    }

    // Node Structure.
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
