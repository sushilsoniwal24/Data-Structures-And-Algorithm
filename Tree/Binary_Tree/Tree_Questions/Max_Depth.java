package Tree.Binary_Tree.Tree_Questions;

/**
 * Max_Depth :- https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */

public class Max_Depth {

    /* Maximum Depth Of A Binary Tree. */
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        return 1 + Math.max(left_height, right_height);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(maxDepth(root));
    }
}
