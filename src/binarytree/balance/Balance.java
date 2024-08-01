package binarytree.balance;

import binarytree.TreeNode;

public class Balance {

    public static boolean isBalanced(TreeNode root) {
        return dfs(root) > -1;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        final var leftDepth = dfs(root.left);
        final var rightDepth = dfs(root.right);
        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
