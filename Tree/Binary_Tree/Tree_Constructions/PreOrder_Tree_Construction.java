package Tree.Binary_Tree.Tree_Constructions;

/* Construct A Binary Tree From A Given PreOrder Traversal. */

public class PreOrder_Tree_Construction {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1;

    public static Node buildTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void main(String[] args) {
        int[] nodes = { 12, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildTree(nodes);
        System.out.println(root.data);
    }
}
