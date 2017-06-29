/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==target)
				return i;
			else if(nums[i]>target)
				return i;
		}
		return target;
		
	}

}
