package arrays.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BinarySearchTest {
    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{5}, 9, -1),
                arguments(new int[]{9, 0}, 9, 0),
                arguments(new int[]{-1, 9}, 9, 1),
                arguments(new int[]{-1, 0, 5, 9, 12}, 9, 3),
                arguments(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                arguments(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void binarySerachTest(int[]array, int target, int expectedIndex) {
        // given
//        assertEquals(expectedIndex, BinarySearch.searchRecursive(array, target));
        assertEquals(expectedIndex, BinarySearch.search(array, target));

        // when

        // then
    }
}