package arrays.buysellstock;

public class BuySellStockSolution {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentMin = Integer.MAX_VALUE;

        for (int currentPrice : prices) {
            if (currentPrice < currentMin) {
                currentMin = currentPrice;
            } else {
                final var currentProfit = currentPrice - currentMin;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}
