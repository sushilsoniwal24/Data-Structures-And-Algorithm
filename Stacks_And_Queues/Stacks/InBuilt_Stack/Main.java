package Stacks_And_Queues.Stacks.InBuilt_Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(28);
        st.push(25);
        st.push(94);
        st.push(14);
        st.push(44);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
