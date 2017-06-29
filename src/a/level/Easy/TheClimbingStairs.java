/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class TheClimbingStairs {

	public static void main(String[] args) {

		System.out.println(permutate("bad", "dab"));
	}

	static int count = 0;

	static int[] carParking(int n, int[][] available) {

		int mid = n / 2;
		for (int i = 0; i < available.length / 2; i++) {
			for (int j = 0; j < available[0].length / 2; j++) {
				if (available[i][mid] == 0)
					return new int[] { i, mid };
			}
		}

		carParking(mid, available);

		return null;

	}

	/* recurive Solution */
	public static void theclimbStairs(int n) {
		if (n <= 0) {
			if (n == 0)
				count++;
			return;
		}

		theclimbStairs(n - 1);
		theclimbStairs(n - 2);

	}

	/* iterative Solution */
	public int climbStairs(int n) {
		int a = 0;
		int b = 1;

		int c = 0;

		while (n != 0) {
			c = a + b;
			a = b;
			b = c;
			n--;
		}

		return c;

	}

	public boolean isHappy(int num) {

		if (num / 10 == 0) {
			if (num == 1)
				return true;
			return false;
		}
		int res = 0;
		while (num != 0) {
			int d = num % 10;
			res = res + (d * d);
			num = num / 10;
		}

		return isHappy(res);
	}

	static int permutate(String string1, String string2) {

		if (string1.length() != string2.length())
			return 0;

		int length1 = string1.length();
		int length2 = string2.length();

		int[] str1 = new int[256];
		int[] str2 = new int[256];

		int spacecount1 = 0, spacecount2 = 0;
		for (char c : string1.toCharArray()) {
			if (c == ' ') {
				spacecount1++;
			}
		}

		for (char c : string2.toCharArray()) {
			if (c == ' ') {
				spacecount2++;
			}
		}

		if (spacecount1 != spacecount2)
			return 0;

		for (int i = 0; i < length1; i++) {
			str1[(int) string1.charAt(i)]++;
			str2[(int) string2.charAt(i)]++;

		}

		for (int i = 0; i < str2.length; i++) {
			if (str1[i] != str2[i])
				return 0;
		}

		return 1;

	}

}
