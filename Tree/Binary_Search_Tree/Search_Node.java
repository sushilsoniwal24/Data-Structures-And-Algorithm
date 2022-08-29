package Tree.Binary_Search_Tree;

/*
 * (1) GFG :-  https://practice.geeksforgeeks.org/problems/search-a-node-in-bst/1
 * (2) LEETCODE :-  https://leetcode.com/problems/search-in-a-binary-search-tree/
 */

public class Search_Node {

    /* (1) GFG:- T.C = O(n) & S.C = O(h). */
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;
        }
        if (root.val > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /* (2) LEETCODE:- T.C = O(n) & S.C = O(h). */
    public static Node searchBST(Node root, int key) {
        if (root == null || root.val == key) {
            return root;
        }
        if (root.val > key) {
            return searchBST(root.left, key);
        } else {
            return searchBST(root.right, key);
        }
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

        System.out.println(search(root, 12));
        System.out.println(searchBST(root, 12));
    }
}
