package binarytree.diameter;

import binarytree.TreeNode;

public class Diameter {

    private static int maxDiameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        dfs(root);
        return maxDiameter;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        int currentDiameter = leftHeight + rightHeight + 2;
        maxDiameter = Math.max(maxDiameter, currentDiameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
