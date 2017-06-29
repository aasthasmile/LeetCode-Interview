/**
 * 
 */
package a.level.Easy;

import java.util.Arrays;

/**
 * @author Aastha Jain
 *
 */
public class AssignCookies {

	public static void main(String[] args) {
		System.out.println(findContentChildren(new int[] { 10, 9, 8, 7 }, new int[] { 5, 6, 7, 8 }));
	}

	/**
	 * Assigning cookies to Children is like a one-to-one mapping between them
	 * We can sort the cookies and chiildren greed in increasing order to get
	 * the mapping between them
	 * 
	 * @param g
	 *            --Number of children(length of array) and Greed of each
	 *            children represented as value.
	 * @param s
	 *            -- Number of cookies(length of array) and Size of the cookie
	 *            represented as value.
	 */

	public static int findContentChildren(int[] g, int[] s) {

		Arrays.sort(g);
		Arrays.sort(s);

		int count = 0;

		/**
		 * if the greed is lesss than size of cookies ,then we assign
		 * cookies(i.e. increment counter)
		 */
		for (int i = 0, j = 0; i < g.length && j < s.length; j++) {
			if (g[i] <= s[j]) {
				count = count + 1;
				i++;

			}
		}

		return count;

	}

}
