/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class BestTimeToBuyAndSell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * In order to determine the maximum difference between selling the stock
	 * and buying the stock. We can find the minimum in the array and keep on
	 * going till we find the element that is maximum greater than the minimum
	 * element in the array.
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {

		if (prices.length == 0)
			return 0;

		int max = 0, min = prices[0];

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > min) {
				max = Math.max(max, prices[i] - min);
			} else {
				min = prices[i];
			}
		}

		return max;
	}
}
