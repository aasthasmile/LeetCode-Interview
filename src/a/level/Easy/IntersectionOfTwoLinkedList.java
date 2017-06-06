package a.level.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoLinkedList  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		int max = Math.max(nums1.length, nums2.length);

		if (max == nums1.length) {
			for (int i = 0; i < nums1.length; i++) {
				if (!map.containsKey(nums1[i]))
					map.put(nums1[i], 1);
				else
					map.put(nums1[i], map.get(nums1[i]) + 1);
			}

			for (int i = 0; i < nums2.length; i++) {
				if (map.containsKey(nums2[i])) {
					map.put(nums2[i], map.get(nums2[i]) - 1);
					if (map.get(nums2[i]) == 0)
						map.remove(nums2[i]);
					list.add(nums2[i]);
				}
			}
		} else {
			for (int i = 0; i < nums2.length; i++) {
				if (!map.containsKey(nums2[i]))
					map.put(nums2[i], 1);
				else
					map.put(nums2[i], map.get(nums2[i]) + 1);
			}

			for (int i = 0; i < nums1.length; i++) {
				if (map.containsKey(nums1[i])) {
					map.put(nums1[i], map.get(nums1[i]) - 1);
					if (map.get(nums1[i]) == 0)
						map.remove(nums1[i]);
					list.add(nums1[i]);
				}
			}
		}

		return list.stream().mapToInt(i -> i).toArray();
	}

}
