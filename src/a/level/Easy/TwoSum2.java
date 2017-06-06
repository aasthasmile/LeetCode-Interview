package a.level.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoSum(new int[] { 2, 3,4 }, 6);
	}

	public int[] twoSum(int[] numbers, int target, boolean flag) {

		int[] arr = null;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == target && j != i) {
					arr = new int[] { i, j };
					break;
				}
			}
		}
		return arr;

	}

	public static int[] twoSum(int[] numbers, int target) {

		int start = 0;
		int end = numbers.length - 1;
		int[] arr = new int[2];

		while (start < end) {
			if (numbers[start] + numbers[end] == target && start != end) {
				arr = new int[] { start + 1, end + 1 };
				break;
			}
			else if(numbers[start]+numbers[end]>target){
				end--;
			}
			else{
				start++;
			}
		}

		return arr;

	}
}
