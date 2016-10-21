package easy;

import java.util.Hashtable;
import java.util.Map;

/*
 Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.
 */
public class IsomorphicStrings {
	char index = 'a';

	public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> table = new Hashtable<Character, Character>();
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (table.get(ch) == null) {
				table.put(ch, index++);
			}
			sb.append(table.get(ch));
		}
		System.out.println(sb.toString());
		table.clear();
		index = 'a';
		int pos = 0;
		for (char ch : t.toCharArray()) {
			if (table.get(ch) == null) {
				table.put(ch, index++);
			}
			if (table.get(ch) != sb.charAt(pos++)) {
				return false;
			}
		}
		return true;
	}
}
