package arrays.movezeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static utils.Utils.printArray;

class MoveZeroesTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                arguments(new int[]{0}, new int[]{0}),
                arguments(new int[]{1}, new int[]{1}),
                arguments(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                arguments(new int[]{0,0}, new int[]{0,0}),
                arguments(new int[]{1,0,0}, new int[]{1,0,0}),
                arguments(new int[]{1,0,1}, new int[]{1,1,0})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void moveZeroes(int[] sourceArray, int[] expectedArray) {
        // given
        MoveZeroes.moveZeroes(sourceArray);
        printArray(sourceArray);
        assertArrayEquals(expectedArray, sourceArray);

        // when

        // then

    }
}