package challenges;

/**
 * A short sell involves borrowing then immediately selling a given stock at a
 * given day i for prices[i], which you must at some point in the future x buy
 * at prices[i + x].
 * 
 * Return the maximum profit from such a sell first then buy transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * Example 1. Input: prices = [3,4,5,4,2] Output: 3 Explanation: Sell on
 * prices[2] and buy on prices[4] for 5 - 2 = 3 profit.
 * 
 * Example 2. Input: prices = [1,2,3,4,5,6] Output: 0 Explanation: No profit can
 * be made from a short sell here.
 */
public class ShortSell {
    public static void main(String[] args) {
        System.out.println(shortSell(new int[] { 3, 4, 5, 3, 2 }));
        System.out.println(shortSell(new int[] { 3, 4, 5, 6, 7 }));
        System.out.println();
        System.out.println(shortSell2(new int[] { 3, 4, 5, 3, 2 }));
        System.out.println(shortSell2(new int[] { 3, 4, 5, 6, 7 }));
        System.out.println();
        System.out.println(f(new int[] { 3, 4, 5, 3, 2 }));
        System.out.println(f(new int[] { 3, 4, 5, 6, 7 }));
    }

    /**
     * Dynamic Programming. Time complexity: O(n) Space complexity: O(1)
     */
    static int shortSell(int[] prices) {
        int maxProfit = 0;
        int bestPrice = 0;
        for (int i = 0; i < prices.length; ++i) {
            if (prices[i] > bestPrice) {
                bestPrice = prices[i];
            } else if (bestPrice - prices[i] > maxProfit) {
                maxProfit = bestPrice - prices[i];
            }
        }
        return maxProfit;
    }

    /**
     * Brute force. Time complexity: O(n^2) Space complexity: O(1)
     */
    static int shortSell2(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {
                int profit = prices[i] - prices[j];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    /**
     * Obfuscated brute force.
     */
    static int f(int[] p) {
        int x = 0;
        for (int i = 0; i < p.length - 1; ++i) {
            for (int j = i + 1; j < p.length; ++j) {
                int d = p[i] - p[j];
                if (d > x) {
                    x = d;
                }
            }
        }
        return x;
    }

}