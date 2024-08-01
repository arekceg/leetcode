package linkedlist.findduplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindDuplicateTest {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(new int[]{1, 3, 4, 2, 2}, 2),
                arguments(new int[]{1, 1, 3, 4, 2}, 1),
                arguments(new int[]{1, 3, 3, 4, 2}, 3),
                arguments(new int[]{1, 3, 3, 4, 2, 5}, 3),
                arguments(new int[]{1, 3, 4, 2, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void shouldFindDupliacteNumberInAnArray(int[] array, int expectedDuplicate) {
        // given

        // when
        final var duplicate = FindDuplicate.findDuplicate(array);

        // then
        assertEquals(expectedDuplicate, duplicate);
    }

}