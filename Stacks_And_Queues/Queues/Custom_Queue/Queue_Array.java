package Stacks_And_Queues.Queues.Custom_Queue;

class MyQueue {
    int[] arr;
    int size;
    int rear;

    public MyQueue(int size) {
        this.size = size;
        arr = new int[size];
        rear = -1;
    }

    /* isEmpty :- Check Whether The Queue Is Empty Or Not. */
    public boolean isEmpty() {
        return (rear == -1);
    }

    /* Enqueue :- Insert An Element. */
    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Is Full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    /* Dequeue :- Remove An Element. */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Already Empty");
            return -1;
        }

        int front = arr[0];
        for (int index = 0; index < rear; index++) {
            arr[index] = arr[index + 1];
        }
        rear--;
        return front;
    }

    /* Peek :- Return The Element Present At The Top. */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
            return -1;
        }
        return arr[0];
    }
}

public class Queue_Array {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(33);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.peek()); 
    }
}
