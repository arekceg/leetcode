package arrays.buysellstock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BuySellStockTest {

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{7,1,5,3,6,4}, 5),
                Arguments.arguments(new int[]{7,6,4,3,1}, 0),
                Arguments.arguments(new int[]{0, 1}, 1),
                Arguments.arguments(new int[]{5, 1}, 0),
                Arguments.arguments(new int[]{3,2,6,5,0,3}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "dataProvider")
    void test(int[] prices, int expectedProfit) {
        // given
        assertEquals(expectedProfit, BuySellStock.maxProfit(prices));

        // when

        // then

    }
}