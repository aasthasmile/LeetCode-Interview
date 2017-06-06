package a.level.Easy;

public class MoveZeros {

	public static void main(String[] args) {
	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				swap(nums[i], nums[j]);
				j++;
			}
		}
	}

	private void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

}
