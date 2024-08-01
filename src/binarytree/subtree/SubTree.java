package binarytree.subtree;

import binarytree.TreeNode;

public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null){
            return false;
        }
        if (isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.right,subRoot) || isSubtree(root.left, subRoot);

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
