package Tree.Binary_Tree.Tree_Questions;

/**
 * Diameter_Binary_Tree :-
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class Diameter_Binary_Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Height Of A Binary Tree. */
    private static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    /* Diameter Of A Binary Tree - O(N^2). */
    public static int diameterOfBinaryTree1(Node root) {
        if (root == null) {
            return 0;
        }

        int op1 = diameterOfBinaryTree1(root.left);
        int op2 = diameterOfBinaryTree1(root.right);
        int op3 = height(root.left) + height(root.right);

        int diameter = Math.max(op3, Math.max(op1, op2));
        return diameter;
    }
    // ------------------------------------------------------------------------------------------------

    /* Diameter Of A Binary Tree - O(N). */
    public static int diameterOfBinaryTree2(Node root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private static int height(Node node, int[] diameter) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.left.left = new Node(8);

        System.out.println(diameterOfBinaryTree1(root));
        System.out.println(diameterOfBinaryTree2(root));
    }

}