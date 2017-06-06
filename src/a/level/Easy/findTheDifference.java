package a.level.Easy;

public class findTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcd", "abcde"));
	}

	/**
	 * Performing XOR operation on the Characters of String . Converting ever
	 * character to an ascii code. When two strings have same charcaters are
	 * XOR-ed,they produce zero output and the one character that is different
	 * will be returned with its Ascii code.
	 * 
	 * @return
	 */
	public static char findTheDifference(String s, String t) {
		int xor = 0;
		for (int i = 0; i < s.length(); i++) {
			xor = xor ^ (int) s.charAt(i);
		}

		for (int i = 0; i < t.length(); i++) {
			xor = xor ^ (int) t.charAt(i);
		}

		return (char) xor;
	}

}
