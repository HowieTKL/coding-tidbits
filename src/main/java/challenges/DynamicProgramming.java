package challenges;

public class DynamicProgramming {

	/**
	 * Kadane's
	 * 10 [2, -1, 5, -5, 6, 1, -1, 1, 2, -1]
	 */
	public static int maxSubarray(int[] array) {
		int current = Integer.MIN_VALUE;
		int max = current;
		
		for (int i: array) {
			current = Math.max(current + i, i);
			max = Math.max(current, max);
		}
		return max;
	}
	
	/**
	 * Buy low, sell high.
	 * 8 [4, 10, 3, 1, 5, 9]
	 */
	public static int stockSale(int[] array) {
		int maxProfit = 0;
		int lowest = Integer.MAX_VALUE;

		for (int i: array) {
			if (i < lowest) {
				lowest = i;
			} else {
				maxProfit = Math.max(maxProfit, i - lowest);
			}
		}
		return maxProfit;
	}
	
	/**
	 * Short sale: buy high, sell low.
	 * 9 [4, 10, 3, 1, 5, 9]
	 */
	public static int shortSale(int[] array) {
		int maxProfit = 0;
		int highest = Integer.MIN_VALUE;

		for (int i: array) {
			if (i > highest) {
				highest = i;
			} else {
				maxProfit = Math.max(maxProfit, highest - i);
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		System.out.println(maxSubarray(new int[] { 2, -1, 5, -5, 6, 1, -1, 1, 2, -1}));
		System.out.println(stockSale(new int[] {4, 10, 3, 1, 5, 9}));
		System.out.println(shortSale(new int[] {4, 10, 3, 1, 5, 9}));
	}

}
