package a.level.Easy;

public class SumOfTwoIntegersWithoutOperators {

	public static void main(String[] args) {

	}

	/**
	 * Without using operators ,adding can be performed as we can do that in
	 * full adder circuit. We need result and carry for each bit manipulation.
	 * 
	 * carry= a & b ( AND operations 7(111)^ 6(110)=111) result =a^b +carry (
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getSum(int a, int b) {

		int carry = 0;
		int res = 0;

		if (a == 0)
			return b;
		else if (b == 0)
			return a;

		while(b!=0){
			carry = a & b;
			a = a ^ b;
			b = (carry) << 1;
		}

		return b;
	}

}
