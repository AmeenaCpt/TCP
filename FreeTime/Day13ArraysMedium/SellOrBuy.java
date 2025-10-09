package FreeTime.Day13ArraysMedium;

public class SellOrBuy {
    public static void main(String[] args) {
        int[] a = {10, 7, 5, 8, 11, 9};
        int n = a.length;

        int minPrice = Integer.MAX_VALUE; // minimum price so far
        int maxProfit = 0;                // maximum profit

        for (int i = 0; i < n; i++) {
            // update minimum price if current price is lower
            if (a[i] < minPrice) {
                minPrice = a[i];
            }

            // calculate profit if selling today
            int profit = a[i] - minPrice;

            // update maximum profit if this profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
