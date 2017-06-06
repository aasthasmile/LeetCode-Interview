package a.level.Easy;

public class NumberComplement {

	public static void main(String[] args) {
		findComplement(5);
	}

	/**
	 * Many methods to calculate complement of the number. Understanding MASK
	 * with the number.
	 * 
	 * Number = 5 (binary -101) represented as 0.....00101(32 bit
	 * representation) Mask = ~0 or 0xFFFF...FF represented as 1.....11111(32
	 * bit representation)
	 * 
	 * We need to perform XOR of last ones digit of mask and number(101 ^ 111
	 * =010)
	 * 
	 * 1. Store originalNum in another variable.
	 * 
	 * 2. Modifying Mask as 1.....1000(left shift to append zeros at end). Note
	 * - number of zeros is identified by NUMBER whose complement to be
	 * calculated. i.e. highest last one bit in Number.
	 * 
	 * 3. originalNumber is right shifted to determine number of zeros in first
	 * step.
	 * 
	 * 3.Complement mask to get 0.....0111(basiclly ones at the end) and
	 * originalNum was          0.....0101.(Perform XOR on them to get
	 * 0....00010(final result).
	 * 
	 */
	public static int findComplement(int num) {

		int mask = ~0; // it consist of all 1's
		int originalNum = num;
		while (num != 0) {
			mask = mask << 1;
			num = num >> 1;
		}

		System.out.println(~mask ^ originalNum);

		return ~mask ^ originalNum;
	}

}
