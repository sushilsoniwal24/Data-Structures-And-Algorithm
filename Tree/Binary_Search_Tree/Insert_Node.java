package Tree.Binary_Search_Tree;

/**
 * Insert Node In A BST :-
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */

public class Insert_Node {

    /* Recursive Method :- T.C = O(h) & S.C = O(h). */
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (root.val > key) {
            root.left = insert(root.left, key);
        }
        if (root.val < key) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    /* Iterative Method :- T.C = O(h) & S.C = O(h). */
    public static Node insertToBST(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        Node current = root;
        while (true) {
            if (current.val < key) {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node(key);
                    break;
                }
            } else {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node(key);
                    break;
                }
            }
        }
        return root;
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

        insertToBST(root, 16);
    }
}