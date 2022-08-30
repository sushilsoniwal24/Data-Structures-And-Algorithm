package Tree.Binary_Search_Tree;

public class Min_Max_BST {

    public static int findMin(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public static int findMax(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
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

        System.out.println("Minimum Value In BST Is:- " + findMin(root));
        System.out.println("Maximum Value In BST Is:- " + findMax(root));
    }
}
