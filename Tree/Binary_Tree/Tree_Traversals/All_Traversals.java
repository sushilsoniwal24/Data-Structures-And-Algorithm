package Tree.Binary_Tree.Tree_Traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class All_Traversals {

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

    static class Pair {
        Node node;
        int num;

        Pair(Node node, int num) {
            this.node = node;
            this.num = num;
        }
    }

    public static void allTraversals(Node root) {

        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();

        stack.push(new Pair(root, 1));

        if (root == null)
            return;

        while (!stack.isEmpty()) {
            Pair p = stack.peek();

            if (p.num == 1) {
                preOrder.add(p.node.data);
                p.num++;
                stack.push(p);

                if (p.node.left != null) {
                    stack.push(new Pair(p.node.left, 1));
                }
            }

            else if (p.num == 2) {
                inOrder.add(p.node.data);
                p.num++;
                stack.push(p);

                if (p.node.right != null) {
                    stack.push(new Pair(p.node.right, 1));
                }
            }

            else {
                postOrder.add(p.node.data);
            }
        }
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

        allTraversals(root);

    }
}
