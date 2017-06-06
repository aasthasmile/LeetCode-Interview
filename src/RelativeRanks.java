import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 5, 4, 3, 2, 1 };
		findRelativeRanks(nums);
	}

	public static String[] findRelativeRanks(int[] nums) {
		Integer[] number = new Integer[nums.length];
		int i = 0;
		for (Integer num : nums) {
			number[i++] = num;
		}

		Arrays.sort(number, Collections.reverseOrder());

		String[] str = new String[nums.length];
		str[0] = "Gold Medal";
		str[1] = "Silver Medal";
		str[2] = "Bronze Medal";

		for (int j = 3; j < nums.length; j++) {
			str[j] = String.valueOf(j + 1);
		}

		for (int k = 0; k < str.length; k++) {
			System.out.println(str[k]);
		}

		return str;
	}

}
