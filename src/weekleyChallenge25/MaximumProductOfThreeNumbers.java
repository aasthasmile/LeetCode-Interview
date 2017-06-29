/**
 * 
 */
package weekleyChallenge25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Aastha Jain
 *
 */
public class MaximumProductOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximumProduct(new int[] { -1, -2, 1 }));
	}

	public static int maximumProduct(int[] nums) {

		Arrays.sort(nums);

		int i = nums.length - 1;

		int maxProduct = nums[i] * nums[i - 1] * nums[i - 2];

		int maxLeftProduct = nums[0] * nums[1] * nums[i];

		return maxProduct > maxLeftProduct ? maxProduct : maxLeftProduct;
	}

	public static int maximumProduct1(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], Math.abs(nums[i]));
			nums[i] = Math.abs(nums[i]);
		}

		map.forEach((key, value) -> System.out.println(key + " " + value));

		int maxProduct = 0;
		Arrays.sort(nums);

		int i = nums.length - 1;

		maxProduct = map.get(nums[i]) * map.get(nums[i - 1]) * map.get(nums[i - 2]);

		return maxProduct;
	}

}
