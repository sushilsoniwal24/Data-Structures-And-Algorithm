package Stacks_And_Queues.Stacks.Custom_Stack;

import java.util.ArrayList;

class MyStack_AL {
    ArrayList<Integer> list = new ArrayList<>();

    /* IsEmpty() :- Check Whether List Is Empty Or Not. */
    public boolean isEmpty() {
        return (list.size() == 0);
    }

    /* Push :- Inserting An Element At The Top. */
    public void push(int data) {
        list.add(data);
    }

    /* Pop :- Removing An Element From The Top. */
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return (list.remove(list.size() - 1));
    }

    /* Peek :- Element Present At The Top. */
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return (list.get(list.size() - 1));
    }
}

public class Stack_ArrayList {
    public static void main(String[] args) {
        MyStack_AL st = new MyStack_AL();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
