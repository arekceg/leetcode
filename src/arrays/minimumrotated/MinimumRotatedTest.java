package arrays.minimumrotated;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MinimumRotatedTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{3, 4, 5, 1, 2}, 1),
                arguments(new int[]{4, 5, 6, 7, 0, 1, 2}, 0),
                arguments(new int[]{4, 5, 6, 7, 8, 1, 2}, 1),
                arguments(new int[]{2, 4, 5, 6, 7, 0, 1}, 0),
                arguments(new int[]{4, 5, 0, 1, 2, 3}, 0),
                arguments(new int[]{11, 13, 15, 17}, 11)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnMinimumFromARotatedArray(int[] array, int expectedMin) {
        // given

        // when
        final var actualMinimum = MinimumRotated.findMin(array);

        // then
        assertEquals(expectedMin, actualMinimum);
    }

}