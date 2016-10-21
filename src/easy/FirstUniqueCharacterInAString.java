package easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		Map<Character, Integer> table = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (table.get(c) == null)
				table.put(c, 1);
			else {
				table.put(c, table.get(c) + 1);
			}
		}
		Set<Character> set = table.keySet();
		for (char c : set) {
			if (table.get(c) == 1)
				return s.indexOf(c);
		}
		return -1;
	}
}
