package easy;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/*Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:

 Input:
 "abccccdd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int result = 0, sum, status = 0;
		Map<Character, Integer> table = new Hashtable<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (table.get(c) == null)
				table.put(c, 1);
			else
				table.put(c, table.get(c) + 1);
		}
		Iterator it = table.keySet().iterator();
		while (it.hasNext()) {
			sum = table.get(it.next());
			if (sum >= 2)
				result += sum / 2 * 2;
			if (sum % 2 == 1)
				status = 1;
		}
		result += status;
		return result;
	}
}
