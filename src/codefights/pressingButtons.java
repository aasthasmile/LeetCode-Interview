package codefights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class pressingButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pressingButtons("42");
	}

	static String[] pressingButtons(String buttons) {

		// base case
		if (buttons.length() == 0)
			return new String[] { "" };

		HashMap<Integer, List<String>> button = new HashMap<>();

		button.put(2, new ArrayList<String>(Arrays.asList("a", "b", "c")));
		button.put(3, new ArrayList<String>(Arrays.asList("d", "e", "f")));
		button.put(4, new ArrayList<String>(Arrays.asList("g", "h", "i")));
		button.put(5, new ArrayList<String>(Arrays.asList("j", "k", "l")));
		button.put(6, new ArrayList<String>(Arrays.asList("m", "n", "o")));
		button.put(7, new ArrayList<String>(Arrays.asList("p", "q", "r", "s")));
		button.put(8, new ArrayList<String>(Arrays.asList("t", "u", "v")));
		button.put(9, new ArrayList<String>(Arrays.asList("w", "x", "y", "z")));

		ArrayList<String> prefix = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		prefix.add("");

		for (int i = 0; i < buttons.length(); i++) {
			List<String> letters = button.get(Integer.parseInt(buttons.charAt(i) + ""));
			for (String pref : prefix) {

				for (int j = 0; j < letters.size(); j++) {
					result.add(pref + letters.get(j));
				}
			}
			prefix = result;
			result = new ArrayList<String>();
		}

		Collections.sort(prefix);

		for (int i = 0; i < prefix.size(); i++) {
			System.out.println(i + "\t" + prefix.get(i));
		}

		String[] res = new String[prefix.size()];

		return prefix.toArray(res);
	}

	public int rob(int[] nums) {
		int a = 0, b = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				a = Math.max(a + nums[i], a);

			else
				b = Math.max(b + nums[i], b);
		}

		return Math.max(a, b);
	}

}
