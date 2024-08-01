package binarytree.sametree;

import binarytree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binarytree.TestTrees.balancedTree;
import static binarytree.TestTrees.rightImbalancedTreeDepth3;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SameTreeTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(balancedTree(), balancedTree(), true),
                arguments(balancedTree(), rightImbalancedTreeDepth3(), false),
                arguments(null, null, true),
                arguments(
                        new TreeNode(1, null, null),
                        new TreeNode(1, null, null),
                        true)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnTrueIfTwoTreesAreTheSame(TreeNode t1, TreeNode t2, boolean expectedResult) {
        // given

        // when
        final var actualResult = SameTree.isSameTree(t1, t2);

        // then
        assertEquals(expectedResult, actualResult);
    }
}