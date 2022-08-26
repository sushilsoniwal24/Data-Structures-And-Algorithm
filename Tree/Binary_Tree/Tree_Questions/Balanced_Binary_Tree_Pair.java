package Tree.Binary_Tree.Tree_Questions;

/**
 * Balanced Binary Tree :- https://leetcode.com/problems/balanced-binary-tree/
 */

public class Balanced_Binary_Tree_Pair {

    static class Pair {
        public boolean isBal;
        public int height;
    }

    // T.C = O(n) & S.C = O(n).
    public static Pair isBalancedTree(Node root) {

        // Base Case.
        if (root == null) {
            Pair ans = new Pair();
            ans.isBal = true;
            ans.height = 0;
            return ans;
        }
        
        Pair left = isBalancedTree(root.left);
        Pair right = isBalancedTree(root.right);

        Pair MyPair = new Pair();
        MyPair.height = Math.max(left.height, right.height) + 1;

        boolean isLeftBal = left.isBal;
        boolean isRightBal = right.isBal;
        boolean height_diff = Math.abs(left.height - right.height) <= 1;

        if (isLeftBal && isRightBal && height_diff) {
            MyPair.isBal = true;
        } else {
            MyPair.isBal = false;
        }

        return MyPair;
    }

    public static boolean isBalanced(Node root) {
        return isBalancedTree(root).isBal;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.left.left = new Node(8);

        System.out.println(isBalanced(root));
    }
}
