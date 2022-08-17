package Stacks_And_Queues.Stacks.Custom_Stack;

class MyStack_LL {
    public Node head;

    /* IsEmpty() :- Check Whether List Is Empty Or Not. */
    public boolean isEmpty() {
        return (head == null);
    }

    /* Push :- Inserting An Element. */
    public void push(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    /* Pop :- Removing An Element. */
    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        Node temp = head;
        head = head.next;
        return temp.data;
    }

    /* Peek :- Element Present At The Top. */
    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        Node temp = head;
        return temp.data;
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

public class Stack_LinkedLIst {
    public static void main(String[] args) {
        MyStack_LL st = new MyStack_LL();

        st.push(7);
        st.push(5);
        st.push(1);
        st.push(2);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}
