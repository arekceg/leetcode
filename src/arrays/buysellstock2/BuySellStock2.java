package arrays.buysellstock2;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class BuySellStock2 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            final var currentPrice = prices[i];
            final var previousPrice = prices[i - 1];
            if (currentPrice > previousPrice){
                profit += currentPrice - previousPrice;
            }
        }
        return profit;
    }
}
