package arrays.threesum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.arguments(new int[]{0, 1, 1}, emptyList()),
                Arguments.arguments(new int[]{0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.arguments(new int[]{-2,0,0,2,2}, List.of(List.of(-2, 0, 2)))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(int[] array, List<List<Integer>> expectedList) {
        // given
        assertEquals(expectedList, ThreeSum.threeSum(array));

        // when

        // then

    }

}