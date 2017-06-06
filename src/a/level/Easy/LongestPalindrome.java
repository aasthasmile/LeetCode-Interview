package a.level.Easy;

import java.util.Hashtable;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("ccc"));
	}

	public static int longestPalindrome(String s) {

		Hashtable<Character, Integer> table = new Hashtable<>();

		for (int i = 0; i < s.length(); i++) {
			if (!table.containsKey(s.charAt(i)))
				table.put(s.charAt(i), 1);
			else
				table.put(s.charAt(i), table.get(s.charAt(i)) + 1);
		}

		table.forEach((key,value)->System.out.println(key+" "+value));
		int count=0;
		for (Map.Entry<Character,Integer> entry : table.entrySet()) {
			count=count+(entry.getValue()/2)*2;
		}
		return count!=s.length() ? count+1:count;
	
	}

}
