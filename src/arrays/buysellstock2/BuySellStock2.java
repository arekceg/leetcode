package arrays.buysellstock2;

public class BuySellStock2 {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
//        int previousPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            var currentPrice = prices[i];
            int previousPrice = prices[i - 1];
            if (currentPrice > previousPrice) {
                totalProfit += currentPrice - previousPrice;
            }
//            if (i > 0) {
//                previousPrice = currentPrice;
//            }
        }
        return totalProfit;
    }
}
