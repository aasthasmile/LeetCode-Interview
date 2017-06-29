/**
 * 
 */
package a.level.Easy;

import java.util.Arrays;

/**
 * @author Aastha Jain
 *
 */
public class maximumSubarray {

	public static void main(String[] args) {

		int[] arr = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// maxSubArray(arr);

		trailingZeroes(5);
	}

	public static int maxSubArray(int[] nums) {

		int maxSum = 0;
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;

		for (int i = start; i < end; i++) {
			maxSum += nums[i];
		}

		System.out.println(maxSum);

		if (maxSum - nums[start] > maxSum) {
			start++;
			maxSum = maxSum - nums[start];
		} else if (maxSum - nums[end] > maxSum) {
			end--;
			maxSum = maxSum - nums[end];
		}

		System.out.println(maxSum);
		return 0;
	}

	public static int trailingZeroes(int num) {

		int n = factorial(num);
		System.out.println(n);
		if (n % 10 != 0)
			return 0;
		int numberOfTrailingZeros = 0;
		int rem = 0;

		while (rem == 0) {

			n = n / 5;
			rem = n % 5;
			numberOfTrailingZeros++;
			System.out.println("num =" + n + " remainder=" + rem);

		}

		System.out.println(numberOfTrailingZeros);
		return numberOfTrailingZeros;
	}

	/**
	 * @param n
	 * @return
	 */
	private static int factorial(int n) {

		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
