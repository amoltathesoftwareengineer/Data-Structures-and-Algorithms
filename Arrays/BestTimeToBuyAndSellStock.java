
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Stock Prices:");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\nMaximum Profit: " + maxProfit(prices));

        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
