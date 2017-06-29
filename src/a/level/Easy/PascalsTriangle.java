/**
 * 
 */
package a.level.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author Aastha Jain
 *
 */
public class PascalsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "a";
		int count = 0;
		int i = s.length() - 1;
		while (s.charAt(i) != ' ' && i>0) {
			count++;
			i--;
		}
		System.out.println(count);
		
	}

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			level.add(1);

			for (int j = 1; j < i; j++) {
				int value = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
				level.add(value);
			}

			if (i != 0)
				level.add(1);
			list.add(level);
		}

		return list;

	}

	public List<Integer> getRow(int rowIndex) {

		List<Integer> level = new ArrayList<Integer>(rowIndex);
		level.add(1);
		for (int i = 0; i < rowIndex + 1; i++) {
			for (int j = 1; j < i; j++) {
				level.set(j, level.get(j) + level.get(j - 1));
			}
		}

		return level;
	}

}
