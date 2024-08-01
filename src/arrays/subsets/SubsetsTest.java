package arrays.subsets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.checkedCollection;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SubsetsTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, List.of(
                                emptyList(),
                                List.of(1),
                                List.of(2),
                                List.of(1, 2),
                                List.of(3),
                                List.of(1, 3),
                                List.of(2, 3)
                        )
                ),
                arguments(new int[]{0}, List.of(
                                emptyList(),
                                List.of(0)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnAllNonRepeatingSubsetsOfArray(int[] arr, List<List<Integer>> expectedSubsets) {
        // given

        // when
        final var actualSubsets = Subsets.subsets(arr);

        // then
        assertEquals(expectedSubsets, actualSubsets);
    }

}