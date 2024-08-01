package arrays.buysellstock2;

import arrays.buysellstock.BuySellStock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStock2Test {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{7,1,5,3,6,4}, 7),
                Arguments.arguments(new int[]{1,2,3,4,5}, 4),
                Arguments.arguments(new int[]{0, 1}, 1),
                Arguments.arguments(new int[]{5, 1}, 0),
                Arguments.arguments(new int[]{7,6,4,3,1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(int[] prices, int expectedProfit) {
        // given
        assertEquals(expectedProfit, BuySellStock2.maxProfit(prices));

        // when

        // then

    }

}