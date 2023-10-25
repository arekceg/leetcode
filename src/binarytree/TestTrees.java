package binarytree;

import java.util.ArrayList;
import java.util.List;

public class TestTrees {

    public static TreeNode balancedTree() {
        final var treeNode1 = new TreeNode(1, null, null);
        final var treeNode3 = new TreeNode(3, null, null);
        final var treeNode2 = new TreeNode(2, treeNode1, treeNode3);
        final var treeNode9 = new TreeNode(9, null, null);
        final var treeNode6 = new TreeNode(6, null, null);
        final var treeNode7 = new TreeNode(7, treeNode6, treeNode9);
        return new TreeNode(4, treeNode2, treeNode7);
    }

    public static TreeNode leftAsymmetricalTreeDepth3() {
        final var treeNode7 = new TreeNode(7, null, null);
        final var treeNode15 = new TreeNode(15, null, null);
        final var treeNode20 = new TreeNode(20, null, null);
        TreeNode treeNode9 = new TreeNode(9, treeNode15, treeNode7);
        return new TreeNode(3, treeNode9, treeNode20);
    }

    public static TreeNode rightAsymmetricalTreeDepth3() {
        final var treeNode7 = new TreeNode(7, null, null);
        final var treeNode15 = new TreeNode(15, null, null);
        final var treeNode20 = new TreeNode(20, treeNode15, treeNode7);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        return new TreeNode(3, treeNode9, treeNode20);
    }
    public static TreeNode leftImbalancedTreeDepth3() {
        TreeNode treeNode1= new TreeNode(1, null, null);
        TreeNode treeNode2= new TreeNode(2, null, null);
        final var treeNode7 = new TreeNode(7, treeNode1, treeNode2);
        final var treeNode15 = new TreeNode(15, null, null);
        final var treeNode20 = new TreeNode(20, treeNode15, treeNode7);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        return new TreeNode(1, treeNode9, treeNode20);
    }

    public static TreeNode twoNodeTreeDepth1() {
        TreeNode treeNode2 = new TreeNode(2, null, null);
        return new TreeNode(1, treeNode2, null);
    }

    public static List<Integer> getRoot(TreeNode treeNode) {
        final List<Integer> nodesList = new ArrayList<>();
        while (treeNode.left != null) {
            nodesList.add(treeNode.val);
            treeNode = treeNode.left;
        }
        while (treeNode.right != null) {
            nodesList.add(treeNode.val);
            treeNode = treeNode.right;
        }
        return nodesList;
    }
}
