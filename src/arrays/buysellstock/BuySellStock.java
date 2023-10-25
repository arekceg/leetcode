package arrays.buysellstock;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int currentMin = MAX_VALUE;
        int currentMax = MIN_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            final var currentPrice = prices[i];
            if (currentPrice < currentMin) {
                currentMin = currentPrice;
                currentMax = MIN_VALUE;
            } else if (currentPrice > currentMax) {
                currentMax = currentPrice;
                final var currentProfit = currentMax - currentMin;
                profit = Math.max(currentProfit, profit);
            }

        }
        return profit;
    }
}
