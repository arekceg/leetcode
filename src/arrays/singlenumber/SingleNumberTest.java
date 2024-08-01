package arrays.singlenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SingleNumberTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{2, 2, 3, 8, 3, 4, 5, 4, 5}, 8)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldReturnSingleNumberFromArray(int[] array, int expectedNumber) {
      // given
        assertEquals(expectedNumber, SingleNumber.singleNumber(array));

      // when

      // then
    }

}