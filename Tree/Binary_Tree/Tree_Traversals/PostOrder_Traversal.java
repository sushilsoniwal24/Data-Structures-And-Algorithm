package Tree.Binary_Tree.Tree_Traversals;

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
    }
}
