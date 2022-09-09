package Heaps.Heap_Questions;

/* Is Binary Tree Heap :- https://bit.ly/3DbOV9b */

public class Check_Heap {

    /* T.C = O(n) & S.C = O(n) */
    public static boolean isHeap(Node root) {

        // Total Number Of Nodes In Given Tree.
        int totalNodes = countNodes(root);

        int index = 0;
        if (isCBT(root, index, totalNodes) && isMaxHeap(root)) {
            return true;
        } else {
            return false;
        }
    }

    /* Check If The Given Tree Is Max Heap Or Not. */
    private static boolean isMaxHeap(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.right == null) {
            return (root.data > root.left.data);
        } else {
            if ((root.data > root.left.data) && (root.data > root.right.data)) {
                return ((isMaxHeap(root.left)) && (isMaxHeap(root.right)));
            }
            return false;
        }

        // boolean left = isMaxHeap(root.left);
        // boolean right = isMaxHeap(root.right);

        // return (left && right && ((root.data > root.left.data) && (root.data >
        // root.right.data)));
    }

    /* Check If The Given Tree Is Complete Binary Tree Or Not. */
    private static boolean isCBT(Node root, int index, int totalNodes) {
        if (root == null) {
            return true;
        }
        if (index >= totalNodes) {
            return false;
        }

        boolean left = isCBT(root.left, 2 * index + 1, totalNodes);
        boolean right = isCBT(root.right, 2 * index + 2, totalNodes);
        return (left && right);
    }

    /* Total Number Of Nodes In Given Tree. */
    private static int countNodes(Node root) {
        if (root == null)
            return 0;

        int cnt = 1 + countNodes(root.left) + countNodes(root.right);
        return cnt;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);

        if (isHeap(root)) {
            System.out.println("Given Binary Tree Is A Max Heap");
        } else {
            System.out.println("Given Binary Tree Isn't A Max Heap");
        }
    }
}
