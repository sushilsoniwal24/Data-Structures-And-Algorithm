package Tree.Binary_Tree.Tree_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder_Traversal {
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

    /* Recursive PostOrder Traversal:- Left -> Right -> Root . */
    public static void recPostOrder(Node root) {
        if (root == null) {
            return;
        }
        recPostOrder(root.left);
        recPostOrder(root.right);
        System.out.print(root.data + " ");
    }
    // ----------------------------------------------------------------------------------------------

    /* Iterative PostOrder Traversal Using 1 Stack. */
    public static List<Integer> postOrder1(Node root) {
        List<Integer> post = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if (root == null) {
            return post;
        }

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                Node temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.peek();
                    stack.pop();
                    post.add(temp.data);
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.peek();
                        stack.pop();
                        post.add(temp.data);
                    }
                } else {
                    root = temp;
                }
            }
        }
        return post;
    }
    // ----------------------------------------------------------------------------------------------

    /* Iterative PostOrder Traversal Using 2 Stacks. */
    public static List<Integer> postOrder2(Node root) {
        List<Integer> post = new ArrayList<>();

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.add(root);

            if (root.left != null) {
                stack1.push(root.left);
            }
            if (root.right != null) {
                stack1.push(root.right);
            }
        }

        while (!stack2.isEmpty()) {
            post.add(stack2.pop().data);
        }

        return post;
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

        recPostOrder(root);
        List<Integer> ans = postOrder1(root);
        System.out.println(ans);
    }
}
