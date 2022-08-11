package LinkedList.Circular_Linked_List.Circular_Concepts;

public class Custom_Circular_LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Custom_Circular_LinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    /* ********** INSERTION IN CIRCULAR LINKED LIST ********** */

    // (1):- Insert At First.
    public void insertFirst(int val) {
        Node node = new Node(val);

        // If List Is Empty.
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        }

        Node temp = head;
        node.next = temp;
        head = node;
        tail.next = head;
        size++;
    }

    // (2):- Insert At Last.
    public void insertLast(int val) {
        Node node = new Node(val);

        // If List Is Empty.
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        }

        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
    }

    // (3):- Insert At A Given Position.
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
        size++;
    }

    /* ********** METHOD TO DISPLAY CIRCULAR LINKED LIST ********** */
    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("Head");
    }

    /* ********** DELETION IN CIRCULAR LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        // Checks whether list is empty
        if (head == null) {
            System.out.println("List is already empty");
            return;
        } else {
            // Checks whether contain only one element
            if (head != tail) {
                head = head.next;
                tail.next = head;
            }
            // If the list contains only one element
            else {
                head = tail = null;
            }
        }
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        // Checks whether list is empty
        if (head == null) {
            System.out.println("List is already empty");
            return;
        } else {
            // Checks whether contain only one element
            if (head != tail) {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                // Second last element will be new tail
                tail = temp;
                tail.next = head;
            }
            // If the list contains only one element
            else {
                head = tail = null;
            }
        }
        size--;
    }

    // (3) Delete Node Of A Given Index.
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

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