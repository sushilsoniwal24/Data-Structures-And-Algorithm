package Tree.Binary_Tree.Tree_Questions;

/**
 * Balanced Binary Tree :- https://leetcode.com/problems/balanced-binary-tree/
 */

public class Balanced_Binary_Tree {

    /* Function To Check Whether A Given Binary Tree Is Balanced Or Not. */

    // Method - 01 :- T.C = O(N^2) & S.C = O(N).
    public static boolean isBalanced1(Node root) {

        // Base Case.
        if (root == null) {
            return true;
        }

        // Calculating The Height Of Left & Right Subtree.
        int left_height = height(root.left);
        int right_height = height(root.right);

        // Condition For A Balance Binary Tree.
        if (Math.abs(left_height - right_height) > 1) {
            return false;
        }

        // Check For Left & Right Subtree.
        boolean is_Left_Balanced = isBalanced1(root.left);
        boolean is_Right_Balanced = isBalanced1(root.right);

        if (is_Left_Balanced == false || is_Right_Balanced == false) {
            return false;
        }

        return true;
    }
    // *****************************************************************

    // Method - 02 :- T.C = O(N) & S.C = O(N).
    public static int check(Node root) {

        // Base Case.
        if (root == null) {
            return 0;
        }

        // Check For Left & Right Subtree.
        int left = check(root.left);
        int right = check(root.right);

        // Check For Balanced Tree.
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        // It'll Only Execute If Tree Isn't Height Balanced.
        if (left == -1 || right == -1) {
            return -1;
        }

        // Return height.
        return Math.max(left, right) + 1;
    }

    public static boolean isBalanced2(Node root) {
        if (check(root) == -1) {
            return false;
        }
        return true;
    }
    // *****************************************************************

    /* Method To Calculate Height Of A Given Tree. */
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(isBalanced1(root));
        System.out.println(isBalanced2(root));
    }
}
