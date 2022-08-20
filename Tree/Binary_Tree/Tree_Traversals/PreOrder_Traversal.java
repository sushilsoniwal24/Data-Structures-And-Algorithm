package Tree.Binary_Tree.Tree_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_Traversal {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /* Recursive PreOrder Traversal:- Root -> Left -> Right. */
    public static void recPreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        recPreOrder(root.left);
        recPreOrder(root.right);
    }

    /* Iterative PreOrder Traversal:- Root -> Left -> Right. */
    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> pre = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        if (root == null) {
            return pre;
        }

        while (!stack.isEmpty()) {
            Node current = stack.peek();
            pre.add(current.data);
            stack.pop();

            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return pre;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(7);
        root.left.left = new Node(12);
        root.left.right = new Node(15);
        root.left.right.right = new Node(14);
        root.right.left = new Node(11);
        root.right.right = new Node(10);
        root.right.right.left = new Node(20);

        recPreOrder(root);
        List<Integer> ans = preorderTraversal(root);
        System.out.println(ans);
    }
}
