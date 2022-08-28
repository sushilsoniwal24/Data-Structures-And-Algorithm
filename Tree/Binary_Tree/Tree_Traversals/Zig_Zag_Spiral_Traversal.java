package Tree.Binary_Tree.Tree_Traversals;

import java.util.*;

/**
 * Zig_Zag_Spiral_Traversal :-
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */

public class Zig_Zag_Spiral_Traversal {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Method-01 :- T.C = O(n) & S.C = O(n). */
    public static void printZigZag(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        currentLevel.push(root);
        boolean LeftToRight = true;

        while (!currentLevel.isEmpty()) {
            Node node = currentLevel.pop();
            System.out.print(node.data + " ");

            // Storing Data According To Current Order.
            if (LeftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }
                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }

            if (currentLevel.isEmpty()) {
                LeftToRight = !LeftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }
    // ----------------------------------------------------------------------------------------

    /* Method -02 :- T.C = O(n) & S.C = O(n). */
    public static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean order = true;

        while (!queue.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (order) {
                    temp.add(node.data);
                } else {
                    temp.addFirst(node.data);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(temp);
            order = !order;
        }
        return res;
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

        printZigZag(root);
        System.out.println(zigzagLevelOrder(root));
    }
}
