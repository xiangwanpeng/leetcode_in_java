package easy;

/*
 Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		int minLen = Integer.MAX_VALUE;
		char ch;
		for (String str : strs)
			if (str.length() < minLen)
				minLen = str.length();
		for (int i = 0; i < minLen; i++) {
			ch = strs[0].charAt(i);
			for (String str : strs) {
				if (str.charAt(i) != ch)
					return sb.toString();
			}
			sb.append(ch);
		}
		return sb.toString();
	}
}
