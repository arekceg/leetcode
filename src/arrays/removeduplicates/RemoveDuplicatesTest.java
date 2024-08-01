package arrays.removeduplicates;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Utils;

import java.net.URL;
import java.util.stream.Stream;

import static arrays.removeduplicates.RemoveDuplicates.removeDuplicates;
import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveDuplicatesTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4}),
                arguments(new int[]{0, 0}, 1, new int[]{0, 0}),
                arguments(new int[]{1, 0}, 2, new int[]{1, 0}),
                arguments(new int[]{1, 2}, 2, new int[]{1, 2}),
                arguments(new int[]{1, 1, 1}, 1, new int[]{1, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldRemoveDuplicatesFromArray(int[] sourceArray, int expectedUniqueIntCount, int[] uniquesArray) {
        // given
        System.out.println("================");
        System.out.println("Source array:");
        Utils.printArray(sourceArray);
        assertEquals(expectedUniqueIntCount, removeDuplicates(sourceArray));
        System.out.println("Processed array:");
        Utils.printArray(sourceArray);
        System.out.println("Expected array:");
        Utils.printArray(uniquesArray);
        System.out.println("================");


        // when

        // then
    }

}