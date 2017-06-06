package a.level.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KeyboardRow {

	public static void main(String[] args) {
		findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" });

	}

	public static String[] findWords(String[] words) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (checkforKeyboardRow(words[i].toLowerCase()))
				list.add(words[i]);
		}

		list.forEach(word -> System.out.println(word));
		String[] keyboard = new String[list.size()];
		return list.toArray(keyboard);
	}

	public static boolean checkforKeyboardRow(String word) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		String[] s1 = new String[] { "qwertyuiop", "asdfghjkl", "zxcvbnm" };

		for (int i = 0; i < s1.length; i++) {
			for (char ch : s1[i].toCharArray())
				map.put(ch, i);

		}

		map.forEach((key, value) -> System.out.println(key + " " + value));

		int num = map.get(word.charAt(0));
		for (int i = 1; i < word.length(); i++) {
			if (map.get(word.charAt(i)) != num)
				return false;
		}
		return true;

	}

}
