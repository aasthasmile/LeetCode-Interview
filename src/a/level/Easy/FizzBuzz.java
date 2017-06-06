package a.level.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.omg.Messaging.SyncScopeHelper;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(15);
		System.out.println(reverse(1534236469));
	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				list.add("FizzBuzz");
			else if (i % 3 == 0)
				list.add("Fizz");
			else if (i % 5 == 0)
				list.add("Buzz");
			else
				list.add(String.valueOf(i));
		}

		list.forEach(value -> System.out.println(value));

		return list;

	}

	public static int reverse(int num) {
		long x = num;
		System.out.println(x);
		if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
			return 0;
		long rem = 0;
		while (x != 0) {
			rem = rem * 10 + (x % 10);
			x = x / 10;
		}
		return (int) rem;
	}

}
