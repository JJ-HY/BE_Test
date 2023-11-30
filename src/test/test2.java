package test;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void bitcoinPrices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<Initializing test2>");
        System.out.print("Size of day : ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter " + n + " prices:");

        int result;
        for(result = 0; result < n; ++result) {
            prices[result] = scanner.nextInt();
        }

        result = maxProfit(prices);
        System.out.println("Imput: " + Arrays.toString(prices));
        System.out.println("Output: " + result);
        scanner.close();
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

}
