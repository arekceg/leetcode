package binarytree.invertbinarytree;

import binarytree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binarytree.TestTrees.balancedTree;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class InvertBinaryTreeTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(balancedTree())
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void binaryTreeInversionTest(TreeNode root) {
        // given
        InvertBinaryTree.invertTree(root);


        // when

        // then
    }

}