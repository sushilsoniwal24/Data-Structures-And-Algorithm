package Tree.Binary_Search_Tree;

/* LCA Of A BST :- https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ */

public class LCA_BST {
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        int curr = root.val;
        if (curr < p.val && curr < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (curr > p.val && curr > q.val) {
            return lowestCommonAncestor(root.left, p, q);
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

        Node ans = lowestCommonAncestor(root, root.right.right, root.left.left.left);  
        System.out.println(ans.val);
    }
}
