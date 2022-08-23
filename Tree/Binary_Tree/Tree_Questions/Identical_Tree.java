package Tree.Binary_Tree.Tree_Questions;

/**
 * Identical_Tree :- https://leetcode.com/problems/same-tree/
 */

public class Identical_Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isSameTree(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null && r2 != null) {
            return false;
        }
        if (r1 != null && r2 == null) {
            return false;
        }

        boolean left = isSameTree(r1.left, r2.left);
        boolean right = isSameTree(r1.right, r2.right);
        boolean val = (r1.data == r2.data);

        if (left && right && val) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.left.left = new Node(8);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.left.left.left = new Node(8);

        System.out.println(isSameTree(root1, root2));
    }
}
