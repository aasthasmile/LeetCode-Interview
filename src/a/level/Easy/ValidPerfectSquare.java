/**
 * 
 */
package a.level.Easy;

/**
 * @author Aastha Jain
 *
 */
public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPerfectSquare(25));
	}

	/**
	 * Simple logic is if you keep on adding odd numbers then the number of
	 * times you add odd number will be the square root of the summation of 1 to
	 * that odd number
	 * 
	 * @example For example 1 = 1 square of 1 1 + 3 = 4 square of 2,,adding two
	 *          times 1 + 3 + 5 = 9 square of 3 adding three times here is my
	 *          simple code
	 * 
	 */

	public static boolean isPerfectSquare(int num) {

		for (int i = 1; num > 0; i = i + 2) {
			System.out.println("i= " + i + " num= " + num);
			num = num - i;
		}

		return (num == 0);
	}
}
