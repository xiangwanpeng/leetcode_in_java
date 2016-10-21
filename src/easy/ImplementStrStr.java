package easy;

/*
 Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		int res = -1, i, j, k;
		for (i = 0; i < haystack.length() - needle.length() + 1; i++) {
			for (j = i, k = 0; k < needle.length(); j++, k++) {
				if (haystack.charAt(j) != needle.charAt(k))
					break;
			}
			if (k == needle.length()) {
				res = i;
				break;
			}
		}
		return res;
	}
}
