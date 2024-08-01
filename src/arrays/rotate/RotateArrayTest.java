package arrays.rotate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Utils;

import java.net.URL;
import java.util.stream.Stream;

import static arrays.rotate.RotateArray.rotate;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RotateArrayTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{1, 2, 3, 4, 5}, 2, new int[]{4, 5, 1, 2, 3}),
                arguments(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}),
                arguments(new int[]{1, 2}, 3, new int[]{2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldRotateArray(int[] sourceArray, int rotationAmount, int[] expectedArray) {
        // given
        Utils.printArray(sourceArray);
        rotate(sourceArray, rotationAmount);
        Utils.printArray(sourceArray);
        assertArrayEquals(expectedArray, sourceArray);


        // when

        // then
    }
}