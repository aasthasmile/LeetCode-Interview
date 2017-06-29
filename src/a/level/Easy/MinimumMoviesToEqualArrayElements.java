/**
 * 
 */
package a.level.Easy;

import java.util.Arrays;

/**
 * @author Aastha Jain
 *
 */
public class MinimumMoviesToEqualArrayElements {

	/**
	 * Given a non-empty integer array of size n, find the minimum number of
	 * moves required to make all array elements equal, where a move is
	 * incrementing n - 1 elements by 1.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/**
	 * In order to make moves to equal array elements ,either every element try
	 * to reach maximum value or every element try to reach minmum value . We
	 * sum those values to consider number of moves required
	 * 
	 * @param nums
	 *            [7,6,1,2,3,4]
	 * @return
	 */
	public int minMoves(int[] nums) {

		Arrays.sort(nums);
		int minMoves = 0;
		int max = nums[nums.length - 1];
		
		for (int i = 0; i < nums.length - 1; i++) {
			minMoves = minMoves + Math.abs(max - nums[i]);
		}

		return minMoves;
	}

}
