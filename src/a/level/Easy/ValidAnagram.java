package a.level.Easy;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("anagram", "ngramaa");
	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;
		char str1[] = s.toCharArray();
		char str2[] = t.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < str2.length; i++) {
			if (str1[i] != str2[i])
				return false;
		}

		return true;

	}

}
