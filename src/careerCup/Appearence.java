package careerCup;

import javax.swing.SpringLayout.Constraints;

/**
 * Given a list of 0 to n numbers and a k i.e. [0-9] range. Find the number of
 * times k appears in the given list. If a number has more than one digit then
 * each digit is considered seperately.
 * 
 * @author Aastha Jain
 *
 */
public class Appearence {

	public static void main(String[] args) {

		int num[] = new int[] { 1, 0, 10, 30, 23, 40 };
		int k = 0;
		System.out.println(isMatch(num, k));
	}

	private static int isMatch(int[] num, int k) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == k || containsDigit(num[i], k))
				count++;
		}
		return count;
	}

	static boolean containsDigit(int num, int k) {
		int rem = 0;
		StringBuilder str = new StringBuilder();
		while (num != 0) {
			rem = num % 10;
			str.append(rem);
			num = num / 10;
		}

		return str.toString().contains(k+"");
	}
}
