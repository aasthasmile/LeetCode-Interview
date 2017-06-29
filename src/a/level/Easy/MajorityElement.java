package a.level.Easy;

public class MajorityElement {

	public static void main(String[] args) {

	}

	public int majorityElement(int[] nums) {

		// int count=(int) Math.floor(nums.length/2);

		int max = nums[0], count = 1;

		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				count++;
				max = nums[i];
				
			} else if (max == nums[i]) {
				count++;
			}
			else{
				count--;
			}
		}
		return 0;
	}
}
