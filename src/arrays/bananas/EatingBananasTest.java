package arrays.bananas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static arrays.bananas.EatingBananas.minEatingSpeed;
import static org.junit.jupiter.api.Assertions.*;

class EatingBananasTest {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testMinEatingSpeed(int[] piles, int h, int expected) {
        assertEquals(expected, minEatingSpeed(piles, h));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 6, 7, 11}, 8, 4),
                Arguments.of(new int[]{30, 11, 23, 4, 20}, 5, 30),
                Arguments.of(new int[]{30, 11, 23, 4, 20}, 6, 23),
                Arguments.of(new int[]{312884470}, 312884469, 2),
                Arguments.of(new int[]{1, 1, 1, 999999999}, 10, 142857143)
        );
    }

}