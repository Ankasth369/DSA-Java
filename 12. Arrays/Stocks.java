public class Stocks {

    // O(n^2)
    public static int buyAndSellStock(int prices[]) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    // O(n)
    public static int buyAndSellStocks(int prices[]) {
        int profit;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStock(prices));
        System.out.println(buyAndSellStocks(prices));
    }
}
