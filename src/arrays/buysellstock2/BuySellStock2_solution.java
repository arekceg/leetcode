package arrays.buysellstock2;

public class BuySellStock2_solution {
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
