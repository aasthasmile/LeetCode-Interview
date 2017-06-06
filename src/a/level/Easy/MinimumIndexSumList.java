package a.level.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MinimumIndexSumList {

	public static void main(String[] args) {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "KFC", "Burger King", "Tapioca Express", "Shogun" };

		findRestaurant(list1, list2);

	}

	public static String[] findRestaurant(String[] list1, String[] list2) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		int punishment = list1.length + list2.length;

		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i + punishment);
		}

		map.forEach((key, value) -> System.out.println(key + "\t" + value));
		System.out.println("-------------");

		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i].trim()))
				map.put(list2[i].trim(), map.get(list2[i].trim()) + i - punishment);
		}

		map.forEach((key, value) -> System.out.println(key + "\t" + value));

		Map.Entry<String, Integer> min = Collections.min(map.entrySet(), new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		int minimum = min.getValue();

		List<String> list = new ArrayList<String>();

		for (Map.Entry<String, Integer> k : map.entrySet()) {
			if (k.getValue() == minimum)
				list.add(k.getKey());
		}
		String[] finalarr = new String[list.size()] ;

		return list.toArray(finalarr);

	}

}
