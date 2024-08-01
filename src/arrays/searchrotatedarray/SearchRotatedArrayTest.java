package arrays.searchrotatedarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SearchRotatedArrayTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{3, 4, 5, 1, 2}, 1, 3),
                arguments(new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4),
                arguments(new int[]{4, 5, 6, 7, 8, 1, 2}, 1, 5),
                arguments(new int[]{2, 4, 5, 6, 7, 0, 1}, 6, 3),
                arguments(new int[]{4, 5, 0, 1, 2, 3}, 0, 2),
                arguments(new int[]{11, 13, 15, 17}, 11, 0),
                arguments(new int[]{5, 1, 3}, 3, 2),
                arguments(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8, 4),
                arguments(new int[]{9, 1, 2, 3, 4, 5, 6}, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldFintIntegerInRotatedArray(int[] array, int target, int expectedIndex) {
        // given

        // when
        final var actualIndex = SearchRotatedArray.search(array, target);

        // then
        assertEquals(expectedIndex, actualIndex);
    }
}