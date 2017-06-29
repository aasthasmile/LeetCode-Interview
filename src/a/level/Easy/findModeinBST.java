/**
 * 
 */
package a.level.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//
//	TreeNode(int x) {
//		val = x;
//	}
//}

/**
 * @author Aastha Jain
 *
 */
public class findModeinBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static int[] findMode(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<>();

		findModeUsingMap(root, map);

		Collections.sort(new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet()),
				new Comparator<Map.Entry<Integer, Integer>>() {

					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
						return o2.getValue().compareTo(o1.getValue());
					}
				});

		int maxValue = Collections.max(map.values());

		List<Integer> list = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValue) {
				list.add(entry.getKey());
				}
		}

		return list.stream().mapToInt(i->i).toArray();
	}

	/* Performing the task using HashMap having extra space complexity */
	public static HashMap findModeUsingMap(TreeNode root, Map<Integer, Integer> map) {

		if (root == null)
			return (HashMap) map;

		findMode(root.left);
		if (map.containsKey(root.val)) {
			map.put(root.val, map.get(root.val) + 1);
		} else {
			map.put(root.val, 1);
		}

		findMode(root.right);
		return null;
	}

}
