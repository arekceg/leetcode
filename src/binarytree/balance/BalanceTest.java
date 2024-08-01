package binarytree.balance;

import binarytree.TestTrees;
import binarytree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binarytree.balance.Balance.isBalanced;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BalanceTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(TestTrees.balancedTree(), true),
                arguments(TestTrees.rightImbalancedTreeDepth3(), false),
                arguments(null, true),
                arguments(new TreeNode(1, null, null), true)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void balanceTest(TreeNode tree, boolean expectedResult) {
      // given
        assertEquals(expectedResult, isBalanced(tree));


      // when

      // then
    }

}