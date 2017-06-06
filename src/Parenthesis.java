
import java.util.ArrayList;
import java.util.Scanner;

public class Parenthesis {

	static ArrayList<String> sol = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		parenthesizations(number);
	}

	private static ArrayList<String> parenthesizations(int number) {
		char[] str = new char[2 * number];

		ArrayList<String> sol = new ArrayList<>();

		printParentheziation(number, number, str, 0, sol);
		return sol;
	}

	public static void printParentheziation(int leftp, int rightp, char[] str, int index,ArrayList<String> sol) {
		if (leftp < 0 || rightp < 0 || leftp > rightp) {
			return;
		}
		if (leftp == 0 && rightp == 0)
			sol.add(String.valueOf(str));
		else {
			str[index] = '(';
			printParentheziation(leftp - 1, rightp, str, index + 1,sol);

			str[index] = ')';
			printParentheziation(leftp, rightp - 1, str, index + 1,sol);
		}
	}

}
