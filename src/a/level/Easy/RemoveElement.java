package a.level.Easy;

public class RemoveElement {

	public static void main(String[] args) {
		
	}

	public int removeElement(int[] nums, int val) {

		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val)
				count++;
		}
		return count;
	}
}
