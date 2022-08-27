package Tree.Binary_Tree.Tree_Questions;

public class Diameter_Binary_Tree_Pair {
    static class Pair {
        int diameter;
        int height;
    }

    // T.C = O(n) & S.C = O(n).
    public static Pair diameterOfBinaryTree1(Node root) {

        // Base Case.
        if (root == null) {
            Pair ans = new Pair();
            ans.height = 0;
            ans.diameter = 0;
            return ans;
        }

        Pair left = diameterOfBinaryTree1(root.left);
        Pair right = diameterOfBinaryTree1(root.right);

        int op1 = left.diameter;
        int op2 = right.diameter;
        int op3 = left.height + right.height + 1;

        Pair MyPair = new Pair();
        MyPair.diameter = Math.max(op1, Math.max(op2, op3));
        MyPair.height = Math.max(left.height, right.height) + 1;

        return MyPair;
    }

    public static int diameterOfBinaryTree(Node root) {
        return diameterOfBinaryTree1(root).diameter;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(diameterOfBinaryTree(root));
    }
}
