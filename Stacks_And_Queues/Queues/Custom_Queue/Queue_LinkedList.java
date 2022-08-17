package Stacks_And_Queues.Queues.Custom_Queue;

class MyQueue_LL {
    public Node front, rear;

    /* Enqueue :- Insert An Element. */
    public void enqueue(int val) {
        Node node = new Node(val);

        if (front == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    /* Dequeue :- Remove An Element. */
    public int dequeue() {
        if (front == null) {
            return -1;
        }
        int res = front.data;
        front = front.next;
        return res;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}

public class Queue_LinkedList {
    public static void main(String[] args) {
        MyQueue_LL q = new MyQueue_LL();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(32);
        q.enqueue(42);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}
