package a.level.Easy;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 });

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				counter++;
				max = Math.max(max, counter);
			} else {
				counter = 0;
			}

		}
		return max;
	}

}
