package arrays.combinationsum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CombinationSumTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{2,3,6,7}, 7, List.of(
                        List.of(2, 3, 3),
                        List.of(7)
                )),
                arguments(new int[]{2,3,5}, 8, List.of(
                        List.of(2, 2, 2, 2),
                        List.of(2, 3, 3),
                        List.of(3, 5)
                ))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnCombinationSums(int[] array, int targetSum, List<List<Integer>> expectedArrays) {
      // given
        
      // when
        final var actualResult = CombinationSum.combinationSum(array, targetSum);

        // then
        assertEquals(expectedArrays, actualResult);
    }
}