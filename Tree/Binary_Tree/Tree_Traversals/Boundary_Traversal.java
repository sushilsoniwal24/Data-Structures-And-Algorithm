package Tree.Binary_Tree.Tree_Traversals;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Boundary_Traversal :-
 * https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
 */

public class Boundary_Traversal {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* T.C = O(n) & S.C = O(h). */
    public static ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (isLeaf(node) == false) {
            ans.add(node.data);
        }
        addLeftBoundary(node, ans);
        addAllLeaves(node, ans);
        addRightBoundary(node, ans);

        return ans;
    }

    // Check For Leaf Node.
    public static boolean isLeaf(Node root) {
        return ((root.left == null) && (root.right == null));
    }

    // Add Left Boundary.
    private static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node current = root.left;
        while (current != null) {
            if (isLeaf(current) == false) {
                res.add(current.data);
            }
            if (current.left != null) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }

    // Add Leaf Nodes.
    private static void addAllLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) {
            addAllLeaves(root.left, res);
        }
        if (root.right != null) {
            addAllLeaves(root.right, res);
        }
    }

    // Add Right Boundary.
    private static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node current = root.right;
        Stack<Integer> stk = new Stack<>();

        while (current != null) {
            if (isLeaf(current) == false) {
                stk.add(current.data);
            }
            if (current.right != null) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        while (!stk.isEmpty()) {
            res.add(stk.pop());
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList<Integer> boundaryTraversal;
        boundaryTraversal = printBoundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }
    }
}
