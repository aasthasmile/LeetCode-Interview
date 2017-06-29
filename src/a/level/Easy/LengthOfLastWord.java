/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class LengthOfLastWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   day"));

	}

	public static int lengthOfLastWord(String s) {
		s = s.trim();

		if (s.equals(""))
			return 0;

		int count = 0;
		int i = s.length() - 1;
		while (s.charAt(i) != ' ' && i<0) {
			count++;
			i--;
		}
		// System.out.println(count);
		return count == 0 ? s.length() : count;
	}

}
