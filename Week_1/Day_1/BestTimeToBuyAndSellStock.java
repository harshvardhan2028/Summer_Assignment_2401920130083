package Week_1.Day_1;

public class buyAndSellStock {
    public int maxProfit(int[] prices) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        if (maxProfit > 0) {
            return maxProfit;
        } else {
            return 0;
        }
    }
}

