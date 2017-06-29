/**
 * 
 */
package a.level.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aastha Jain
 *
 */
public class MaximumDistanceInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arrays = new ArrayList<List<Integer>>();
		List<Integer> level1 = Arrays.asList(-2);
		List<Integer> level2 = Arrays.asList(-3, -2, 1);
		arrays.add(level1);
		arrays.add(level2);

		arrays.forEach(value -> System.out.println(value));

		maxDistance(arrays);
	}

	public static int maxDistance(List<List<Integer>> arrays) {

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (List<Integer> list : arrays) {
			min = Math.min(list.get(0), min);

			System.out.println(min + " min  ");
		}

		// boolean flag = false;

		for (int index = 0; index < arrays.size(); index++) {
			if (arrays.get(index).get(0) == min) {// && !flag) {
				arrays.remove(arrays.get(index));
				// flag = true;
				break;
			}
		}

		for (List<Integer> list : arrays) {
			max = Math.max(list.get(list.size() - 1), max);
			System.out.println(max + " max ");
		}

		return max - min;
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
	
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			map.put(nums[i], map.get(nums[i]) + 1);
		}

		return false;
	}
}
