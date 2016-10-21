package easy;

import java.util.Hashtable;
import java.util.Map;

/*
 Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class WordPattern {
	char index = 'a';

	public boolean wordPattern(String pattern, String str) {
		if (pattern.length() != str.split(" ").length)
			return false;
		Map<String, Character> table = new Hashtable<String, Character>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < pattern.length(); i++) {
			if (table.get(String.valueOf(pattern.charAt(i))) == null) {
				table.put(String.valueOf(pattern.charAt(i)), index++);
			}
			sb.append(table.get(String.valueOf(pattern.charAt(i))));
		}
		String[] sub = str.split(" ");
		index = 'a';
		table.clear();
		for (int i = 0; i < sub.length; i++) {
			if (table.get(sub[i]) == null)
				table.put(sub[i], index++);
			if (table.get(sub[i]) != sb.charAt(i))
				return false;
		}
		return true;

		/*
		 * String[] words = str.split(" "); if (words.length !=
		 * pattern.length()) return false; Map index = new HashMap(); for
		 * (Integer i=0; i<words.length; ++i) if (index.put(pattern.charAt(i),
		 * i) != index.put(words[i], i)) return false; return true;
		 */
	}
}
