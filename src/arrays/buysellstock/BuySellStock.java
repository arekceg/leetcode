package arrays.buysellstock;

public class BuySellStock {
    /*
    Start at 0
    Look for larger value
    Calculate profit, store it
    Start at that value
    Repeat
     */
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int max;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            max = price;
            maxProfit = Math.max(max - min, maxProfit);
        }
        return maxProfit;
    }
}
