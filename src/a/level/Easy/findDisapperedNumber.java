/**
 * 
 */
package a.level.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aastha Jain
 *
 */
public class findDisapperedNumber {

	public static void main(String[] args) {
		findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int position = Math.abs(nums[i]);
			if (nums[position - 1] > 0)
				nums[position - 1] = -nums[position - 1];
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i+1);
			}
		}
		return list;
	}

}
