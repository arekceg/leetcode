package binarytree.maximumdepth;

import binarytree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binarytree.TestTrees.leftAsymmetricalTreeDepth3;
import static binarytree.TestTrees.rightAsymmetricalTreeDepth3;
import static binarytree.maximumdepth.MaximumDepth.maxDepth;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumDepthTest {

    public static Stream<Arguments> provider() {
        return of(
                arguments(leftAsymmetricalTreeDepth3()),
                arguments(rightAsymmetricalTreeDepth3())
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provider")
    void maximumDepthTest(TreeNode tree) {
      // given
        assertEquals(3, maxDepth(tree));


      // when

      // then
    }

}