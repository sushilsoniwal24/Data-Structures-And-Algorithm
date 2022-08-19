package Tree.Binary_Tree.Tree_Traversals;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LevelOrder_Traversal
 */
public class LevelOrder_Traversal {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Code For Iterative Level Order Traversal. */
    public static void levelOrder(Node root) {

        // If Tree Is Empty.
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node current = queue.remove();

            if (current == null) {
                System.out.println(); // Add A Line Break.

                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(current.data + " ");

                // Adding Left's Data In Queue
                if (current.left != null) {
                    queue.add(current.left);
                }

                // Adding Right's Data In Queue
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(13);
        root.right = new Node(20);
        root.left.left = new Node(12);
        root.left.right = new Node(14);
        root.right.left = new Node(18);
        root.right.right = new Node(22);
        root.left.left.left = new Node(10);
        root.right.right.left = new Node(21);
        root.right.right.right = new Node(23);
        root.left.left.left.left = new Node(9);
        root.left.left.left.right = new Node(11);

        levelOrder(root);
    }
}