package arrays.twosum.second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TwoSumTwoTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void twoSum(int[] numbers, int target, int[] expected) {
        TwoSumTwo twoSumTwo = new TwoSumTwo();
        Assertions.assertArrayEquals(expected, twoSumTwo.twoSum(numbers, target));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2}),
                Arguments.of(new int[]{3, 24, 50, 79, 88, 150, 345}, 200, new int[]{3, 6})
        );
    }
}