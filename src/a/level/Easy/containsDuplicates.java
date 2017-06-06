package a.level.Easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class containsDuplicates {

	public static void main(String[] args) {
		containsDuplicate(new int[] { 1, 2, 2, 1 });
	}

	public static boolean containsDuplicate(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(i))
				return false;
			map.put(i, 1);
		}
		return true;

	}

}
