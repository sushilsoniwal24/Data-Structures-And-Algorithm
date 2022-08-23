package Tree.Binary_Tree.Tree_Constructions;

import java.util.Scanner;

public class Recursive_Construction {
    static Scanner in = null;

    static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    /* Method To Create A Tree Step-By-Step Using Recursion. */
    public static Node createTree() {
        System.out.print("Enter Data:-");
        int data = in.nextInt();

        if (data == -1) {
            return null;
        }

        Node root = new Node(data);

        // Recursive Call For Left.
        System.out.println("Enter left for " + data);
        root.left = createTree();

        // Recursive Call For Right.
        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        Node root = createTree();
        System.out.println(root.val);
    }
}
