package arrays.squaresortedarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static utils.Utils.printArray;

class SquareSortedArrayTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
                arguments(new int[]{-5,-3,-2,-1}, new int[]{1,4,9,25}),
                arguments(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121}),
                arguments(new int[]{1, 2, 3}, new int[]{1, 4, 9}),
                arguments(new int[]{-7}, new int[]{49}),
                arguments(new int[]{0}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void squareSortedArrayTest(int[] source, int[] expectedResult) {
        // given
        System.out.println("SOURCE:");
        printArray(source);
        System.out.println("EXPECTED:");
        printArray(expectedResult);
        final var actual = SquareSortedArray.sortedSquares(source);
        System.out.println("ACTUAL:");
        printArray(actual);
        assertArrayEquals(expectedResult, actual);

        // when

        // then

    }

}