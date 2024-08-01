package strings.romantoint;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntTest {

    @ParameterizedTest
    @MethodSource("romanToIntProvider")
    void test(String roman, int expectedResult) {
        final var actualInt = RomanToInt.romanToInt(roman);
        System.out.println("ROMAN : " + roman);
        System.out.println("EXPECTED INT : " + expectedResult);
        System.out.println("ACTUAL INT : " + actualInt);
        assertEquals(expectedResult, actualInt);
    }

    private static Stream<Arguments> romanToIntProvider() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("MCCXCIV", 1294),
                Arguments.of("IV", 4)
        );
    }
}