package arrays.maxsubarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaxSubArrayTest {


    public static Stream<Arguments> maxSubArrayDataProvider() {
        return Stream.of(
                arguments(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                arguments(new int[]{1}, 1),
                arguments(new int[]{5, 4, -1, 7, 8}, 23)
        );
    }

    public static Stream<Arguments> subarrayWithLengthAndSumProvider() {
        return Stream.of(
                arguments(new int[]{-2, 1, -3, 4, -1, 3, 1, -5, 4}, 2, 2, new int[]{4, 5}),
                arguments(new int[]{1, 2}, 3, 2, new int[]{0, 1}),
                arguments(new int[]{5, 4, -1, 7, 8, -1}, 14, 3, new int[]{3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "maxSubArrayDataProvider")
    void maxSubArrayTest(int[] sourceArray, int expectedMaxSum) {
        // given
        assertEquals(expectedMaxSum, MaxSubArray.maxSubArray(sourceArray));

        // when

        // then

    }

    @ParameterizedTest
    @MethodSource(value = "subarrayWithLengthAndSumProvider")
    void subarrayWithLengthAndSumTest(int[] sourceArray, int expectedSum, int subArrayLength, int[] subArrayIndexes) {
        // given
//        System.out.println("EXPECTED ARRAY:");
//        printArray(subArrayIndexes);
//        System.out.println("\n");
//        final var actualArray = MaxSubArray.subArrayWithSumAndLength(sourceArray, expectedSum, subArrayLength);
//        System.out.println("ACTUAL ARRAY:");
//        printArray(actualArray);
//        assertArrayEquals(subArrayIndexes, actualArray);

        // when

        // then

    }
}