package binarytree.diameter;

import binarytree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binarytree.diameter.Diameter.diameterOfBinaryTree;
import static binarytree.TestTrees.balancedTree;
import static binarytree.TestTrees.leftAsymmetricalTreeDepth3;
import static binarytree.TestTrees.rightAsymmetricalTreeDepth3;
import static binarytree.TestTrees.twoNodeTreeDepth1;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DiameterTest {
    
    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(balancedTree(), 4),
                arguments(leftAsymmetricalTreeDepth3(), 3),
                arguments(rightAsymmetricalTreeDepth3(), 3),
                arguments(twoNodeTreeDepth1(), 1)
        );
    }
    
    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void binaryTreeDiameter(TreeNode tree, int expectedDiameter) {
      // given
        assertEquals(expectedDiameter, diameterOfBinaryTree(tree));

      
      // when
      
      // then
    }

}