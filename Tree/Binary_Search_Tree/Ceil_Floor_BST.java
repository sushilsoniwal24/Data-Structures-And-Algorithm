package Tree.Binary_Search_Tree;

public class Ceil_Floor_BST {

    /* Find Ceil Of A Number. (Val >=num) */
    public static int findCeil(Node root, int key) {
        int ceil = -1;

        while (root != null) {
            if (root.val == key) {
                ceil = root.val;
                return ceil;
            }
            if (root.val > key) {
                ceil = root.val;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return ceil;
    }

    /* Find Ceil Of A Number. (Val >=num) */
    public static int findFloor(Node root, int key) {
        int floor = -1;

        while (root != null) {
            if (root.val == key) {
                floor = root.val;
                return floor;
            }
            if (root.val > key) {
                floor = root.val;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return floor;
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

        System.out.println("The Ceil Is:- " + findCeil(root, 14));
        System.out.println("The Floor Is:- " + findFloor(root, 14));
    }
}
