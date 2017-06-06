
public class HammingDistance {

	public static void main(String[] args) {
		int nums[] = new int[] { 4, 14, 2 };

		System.out.println(totalHammingDistance(nums));
	}

	public static int totalHammingDistance(int[] nums) {

		int hammingDis = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int xor = nums[i] ^ nums[j];
				hammingDis += hammingDistance(xor);
			}
		}
		return hammingDis;
	}

	private static int hammingDistance(int num) {
		int count = 0;
		while (num != 0) {
			num = num & (num - 1);
			count++;
		}

		return count;
	}

}
