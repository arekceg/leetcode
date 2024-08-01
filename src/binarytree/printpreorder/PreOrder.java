package binarytree.printpreorder;

public class PreOrder {
    public static void preOrder(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        buildPreOrderString(stringBuilder, root);
        System.out.println(stringBuilder);
    }

    private static void buildPreOrderString(StringBuilder stringBuilder, Node root) {
        if (root == null) {
            return;
        }
        stringBuilder.append(root.data).append(" ");
        buildPreOrderString(stringBuilder, root.left);
        buildPreOrderString(stringBuilder, root.right);

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static class Node {
        public Node(int data) {
            this.data = data;
        }

        int data;
        Node left;
        Node right;
    }
}
