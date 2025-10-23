package FreeTime.Day13ArraysMedium;

public class SellOrBuy {
    public static void main(String[] args) {
        int[] a = {10, 7, 5, 8, 11, 9};
        int n = a.length;

        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0;               
        for (int i = 0; i < n; i++) {
            
            if (a[i] < minPrice) {
                minPrice = a[i];
            }
            int profit = a[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
