package Tree.Binary_Tree.Tree_Questions;

public class Balanced_Binary_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Is Balanced Binary Tree :- O(N^2). */
    public static boolean check1(Node root) {
        if (root == null) {
            return true;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) > 1) {
            return false;
        }

        boolean left = check1(root.left);
        boolean right = check1(root.right);

        if (left == false || right == false) {
            return false;
        }
        return true;
    }

    /* Method To Calculate Height. */
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    /* Is Balanced Binary Tree :- O(N). */
    public static int check2(Node root) {
        if (root == null) {
            return 0;
        }
        int left = check2(root.left);
        int right = check2(root.right);

        if (left == -1 || right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(check1(root));
        System.out.println(check2(root));
    }

}
