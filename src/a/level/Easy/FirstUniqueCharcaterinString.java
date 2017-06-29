/**
 * 
 */
package a.level.Easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Aastha Jain
 *
 */
public class FirstUniqueCharcaterinString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * In order to maintain the insertion order we will be able to find the
	 * forst non repeaitn charcater frequently.
	 */
	public int firstUniqChar(String s) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}

		int index = 0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				index = s.indexOf(entry.getKey());
				return index;
			}
		}

		return -1;
	}

}
