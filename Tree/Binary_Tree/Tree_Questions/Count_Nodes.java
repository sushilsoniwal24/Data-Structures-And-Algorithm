package Tree.Binary_Tree.Tree_Questions;

/**
 * Count_Nodes :-
 */

public class Count_Nodes {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* Count The Nodes:- O(N). */
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);

        return leftcount + rightcount + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(count(root));
    }
}
