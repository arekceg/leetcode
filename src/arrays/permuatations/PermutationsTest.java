package arrays.permuatations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PermutationsTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{1, 2, 3}, List.of(
                        List.of(1, 2, 3),
                        List.of(2, 1, 3),
                        List.of(1, 3, 1),
                        List.of(1, 3, 2),
                        List.of(3, 1, 2),
                        List.of(2, 3, 1)
                )),
                arguments(new int[]{1, 0}, List.of(
                        List.of(1, 0),
                        List.of(0, 1)
                )),
                arguments(new int[]{1}, List.of(
                        List.of(1)
                ))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnAllPermutationsOfAnArray(int[] array, List<List<Integer>> expectedPermutations ) {
        // given

        // when
        final var actualPermutations = Permutations.permute(array);

        // then
        assertEquals(expectedPermutations, actualPermutations);
    }
}