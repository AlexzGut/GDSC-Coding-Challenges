package Easy;

import java.util.Random;
import java.util.Arrays;

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        final int SIZE_DECLARATOR = new Random().nextInt(106);
        int[] prices = new int[SIZE_DECLARATOR];
        int maximumProfit;

        populatePrices(prices);
        System.out.println("Prices: " + Arrays.toString(prices));

        maximumProfit = maximumProfit(prices);
        System.out.printf("Maximum profit: %d", maximumProfit);
    }

    public static int maximumProfit(int[] array) {
        int profit,
                maxProfit = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    profit = array[j] - array[i];
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static void populatePrices(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(105);
        }
    }
}
