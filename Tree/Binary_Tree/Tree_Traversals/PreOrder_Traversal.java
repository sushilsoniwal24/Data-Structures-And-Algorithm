package Tree.Binary_Tree.Tree_Traversals;

public class PreOrder_Traversal {

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

    /* Recursive PreOrder Traversal:- Root -> Left -> Right. */
    public static void recPreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        recPreOrder(root.left);
        recPreOrder(root.right);
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

        recPreOrder(root);
    }
}
