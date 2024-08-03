package arrays.intersection2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Utils;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.String.format;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static utils.Utils.printArray;

class Intersection2Test {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{1, 8, 1, 5, 7, 3, 4, 5}, new int[]{1, 1, 5, 3, 8}, new int[]{1, 1, 3, 5,8 }),
                arguments(new int[]{7, 2}, new int[]{1, 8, 5, 7, 3, 4, 5}, new int[]{7}),
                arguments(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2}),
                arguments(new int[]{1, 2}, new int[]{1, 1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnIntersectionOfTwoArrays(int[] firstArray, int[] secondArray,
                                             int[] expectedIntersection) {
        // given

        // when
        final var intersectedArray = Intersection2.intersect(firstArray, secondArray);

        // then

        var string = Arrays.toString(firstArray);
        var string1 = Arrays.toString(secondArray);
        var string2 = Arrays.toString(intersectedArray);
        System.out.printf("%s $ %s = %s, expected = %s%n", string, string1, string2, Arrays.toString(expectedIntersection));
        assertArrayEquals(intersectedArray, expectedIntersection);
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnIntersectionOfTwoArraysWithSorting(int[] firstArray, int[] secondArray,
                                             int[] expectedIntersection) {
        // given

        // when
//        final var intersectedArray = Intersection2.intersectSort(firstArray, secondArray);

        // then
//        Utils.printArray(intersectedArray);
    }
}