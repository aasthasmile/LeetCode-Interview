/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class DecimalToHexadecimal {

	public static void main(String[] args) {
		System.out.println(toHex(-1));
	}

	public static String toHex(int num) {

		String decimaltoHex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

		if (num == 0)
			return "0";

		String result = "";

		StringBuilder sb = new StringBuilder();

		while (num != 0) {
			sb.append(decimaltoHex[num & 15]);
			num = num >>> 4; // logical right shift the data by 4 bit and then
								// mask them by 15(decimal-1111) . We do AND of
								// num & 15 to get num itself.
								// Hex.

		}

		
		return sb.reverse().toString();

	}

}
