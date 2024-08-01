package arrays.duplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ContainsDuplicateTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{1, 2, 3 , 1}, true)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnTrueIfArrayContainsDuplicates(int[] arr, boolean expectedResult) {
      // given
        assertEquals(expectedResult, ContainsDuplicate.containsDuplicate(arr));

      // when

      // then
    }
}