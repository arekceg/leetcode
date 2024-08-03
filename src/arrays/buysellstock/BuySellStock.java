package arrays.buysellstock;

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int currentPrice : prices) {
            maxProfit = Math.max(maxProfit, currentPrice - min);
            min = Math.min(currentPrice, min);
        }
        return maxProfit;
    }
}
