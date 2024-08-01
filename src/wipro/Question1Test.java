package wipro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.stream.Stream.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Question1Test {

    public static Stream<Arguments> dataProvider() {
        return of(
                arguments(3, 5, 6, 6),
                arguments(1, 3, 3, 3),
                arguments(2, 4, 8, 7)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(int lo, int high, int k, int expectedMax) {
        // given
        final var actualMax = Question1.maxXor(lo, high, k);

        // when

        // then
        assertEquals(expectedMax, actualMax);
    }
}