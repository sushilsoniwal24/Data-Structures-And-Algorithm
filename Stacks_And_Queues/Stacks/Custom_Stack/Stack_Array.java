package Stacks_And_Queues.Stacks.Custom_Stack;

class MyStack {
    int[] arr;
    int top;
    int size;

    public MyStack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    /* Push :- Inserting An Element At The Top. */
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Is Full");
        }
        top++;
        arr[top] = data;
    }

    /* Pop :- Removing An Element From The Top. */
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
        }
        int num = arr[top];
        top--;
        return num;
    }

    /* Peek :- Element Present At The Top. */
    public int peek() {
        if (top == -1) {
            System.out.println("Stack Is Empty");
        }
        return arr[top];
    }
}

public class Stack_Array {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
