/**
 * 
 */
package a.level.Easy;

import java.util.Arrays;

/**
 * @author Aastha Jain
 *
 */
public class findRadius {

	public static void main(String[] args) {
		findRadiusR(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 3 });
		
		searchRange(new int[]{5, 7, 7, 8, 8, 10},8);
	}

	/**
	 * Arrays.BinarySearch
	 * 
	 * @explain Returns: index of the search key, if it is contained in the
	 *          array; otherwise, (-(insertion point) - 1). The insertion point
	 *          is defined as the point at which the key would be inserted into
	 *          the array: the index of the first element greater than the key,
	 *          or a.length if all elements in the array are less than the
	 *          specified key. Note that this guarantees that the return value
	 *          will be >= 0 if and only if the key is found.
	 */

	public static int findRadiusR(int[] houses, int[] heaters) {
		Arrays.sort(heaters);
		int result = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int dist1 = 0;
		int dist2 = 0;

		for (int i = 0; i < houses.length; i++) {
			int index = Arrays.binarySearch(heaters, houses[i]);
			index = index < 0 ? -(index) - 1 : index;

			if (index - 1 >= 0) {
				dist1 = houses[i] - heaters[index - 1];
			} else {
				dist1 = Integer.MAX_VALUE;
			}

			if (index < heaters.length) {
				dist2 = heaters[index] - houses[i];
			} else {
				dist2 = Integer.MAX_VALUE;
			}

			min = Math.min(dist1, dist2);
			result = Math.max(result, min);
		}

		return result;
	}

	public static int[] searchRange(int[] nums, int target) {

		int leftIndex=Arrays.binarySearch(nums, target);
		int rightIndex=Arrays.binarySearch(nums, target);
		System.out.println(leftIndex+" "+rightIndex);
		return null;
	}

}
