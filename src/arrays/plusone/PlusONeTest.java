package arrays.plusone;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Utils;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PlusONeTest {


    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{1, 9, 9}, new int[]{2, 0, 0}),
                arguments(new int[]{1, 2, 9}, new int[]{1, 3, 0}),
                arguments(new int[]{1, 2, 8}, new int[]{1, 2, 9}),
                arguments(new int[]{9}, new int[]{1, 0}),
                arguments(new int[]{9, 9}, new int[]{1, 0, 0}),
                arguments(new int[]{9,8,7,6,5,4,3,2,1,0}, new int[]{9,8,7,6,5,4,3,2,1,1})

        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldAddPlusOneToTheEndOfArray(int[]source, int[]expectedArray) {
      // given
        Utils.printArray(source);
        Utils.printArray(expectedArray);
        final var incrementedArray = PlusONe.plusOne(source);
        Utils.printArray(incrementedArray);
        assertArrayEquals(expectedArray, incrementedArray);

      // when

      // then
    }
}