package Tree.Binary_Tree.Tree_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder_Traversal {
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

    /* Recursive InOrder Traversal:- Left -> Root -> Right. */
    public static void recInOrder(Node root) {
        if (root == null) {
            return;
        }
        recInOrder(root.left);
        System.out.print(root.data + " ");
        recInOrder(root.right);
    }

    /* Iterative InOrder Traversal:- Left -> Root -> Right. */
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (true) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                current = stack.pop();
                inorder.add(current.data);
                current = current.right;
            }
        }
        return inorder;
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

        recInOrder(root);
        List<Integer> ans = inorderTraversal(root);
        System.out.println(ans);
    }
}
