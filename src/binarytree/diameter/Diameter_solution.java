package binarytree.diameter;

import binarytree.TreeNode;

public class Diameter_solution {
    private static int maxDiameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        int current = leftHeight + rightHeight + 2;
        maxDiameter = Math.max(maxDiameter, current);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
