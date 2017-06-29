package a.level.Easy;

public class AddingStrings {

	/**
	 * You must not use any built-in BigInteger library or convert the inputs to
	 * integer directly.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addStrings("111", "29");
	}

	/*
	 * I will try to add elements from end till we reach beginning of numbers.
	 * We keep on storing the carry for next result.
	 * 
	 */
	public static String addStrings(String num1, String num2) {

		StringBuilder sb = new StringBuilder();
		int start1 = num1.length() - 1;
		int start2 = num2.length() - 1;

		int carry = 0, digit1 = 0, digit2 = 0;

		/** Adding from last digit of string */
		for (int i = start1, j = start2; i >= 0 || j >= 0 || carry == 1; i--, j--) {
			if (i >= 0)
				digit1 = (int) (num1.charAt(i) - '0');
			else
				digit1 = 0;

			if (j >= 0)
				digit2 = (int) (num2.charAt(j) - '0');
			else
				digit2 = 0;

			int sum = digit1 + digit2 + carry;

			int rem = sum % 10;
			carry = sum / 10;

			//Adding last two digits ,if digit size is greater than 1 then adding remainder
			sb.append(rem);

		}

		System.out.println("Result " + sb.reverse().toString());
		return sb.reverse().toString();
	}

}
