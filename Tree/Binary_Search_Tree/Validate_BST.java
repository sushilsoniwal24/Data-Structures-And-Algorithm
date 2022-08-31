package Tree.Binary_Search_Tree;

/* Validate BST :- https://leetcode.com/problems/validate-binary-search-tree/ */

public class Validate_BST {

    /* T.C = O(n) & S.C = O(n) */
    public static boolean isValidBST(Node root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean checkBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        if (checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max)) {
            return true;
        }
        return false;
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

        System.out.println(isValidBST(root));
    }
}
