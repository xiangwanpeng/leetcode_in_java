package easy;

/*
 Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".
 */
public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
		if (s == null || s.length() <= 1)
			return s;
		StringBuffer sb = new StringBuffer(s);
		char temp;
		int left = 0, right = sb.length() - 1;
		while (true) {
			while (left < sb.length() && !isVowel(sb.charAt(left)))
				left++;
			if (left == sb.length())
				return sb.toString();
			while (right > -1 && !isVowel(sb.charAt(right)))
				right--;
			if (right == -1)
				return sb.toString();
			if (left < right) {
				temp = sb.charAt(left);
				sb.setCharAt(left, sb.charAt(right));
				sb.setCharAt(right, temp);
				left++;
				right--;
			} else
				return sb.toString();
		}
	}

	boolean isVowel(char ch) {
		return ch == 'a' || ch == 'o' || ch == 'e' || ch == 'u' || ch == 'i'
				|| ch == 'A' || ch == 'O' || ch == 'E' || ch == 'U'
				|| ch == 'I';
	}
}
