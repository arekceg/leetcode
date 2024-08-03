package binarytree.balance;

import binarytree.TreeNode;

public class Balance_solution {

    private static boolean isBalanced;

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        final var dfs = dfs(root);
        return dfs > -1;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int heightLeft = dfs(root.left);
        int heightRight = dfs(root.right);
        if (heightLeft == -1 || heightRight == -1 || Math.abs(heightLeft - heightRight) > 1) {
            return -1;
        }
        return Math.max(heightLeft, heightRight) + 1;
    }
}
