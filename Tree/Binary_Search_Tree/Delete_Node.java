package Tree.Binary_Search_Tree;

/**
 * Delete_Node :- https://leetcode.com/problems/delete-node-in-a-bst/
 */

public class Delete_Node {

    public static Node deleteFromBST(Node root, int key) {
        // Base Case.
        if (root == null) {
            return root;
        }
        if (root.val > key) {
            root.left = deleteFromBST(root.left, key);
        } else if (root.val < key) {
            root.right = deleteFromBST(root.right, key);
        } else {
            // 0 Child.
            if (root.left == null && root.right == null) {
                return null;
            }

            // 1 Child.
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // 2 Childs.
            else {
                Node minNode = findMin(root.right);
                root.val = minNode.val;
                root.right = deleteFromBST(root.right, root.val);
            }
        }
        return root;
    }

    private static Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
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

        deleteFromBST(root, 23);
    }
}
