package easy;

/*
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (true) {
			while (left < s.length()
					&& !(s.charAt(left) >= 'a' && s.charAt(left) <= 'z'
							|| s.charAt(left) >= 'A' && s.charAt(left) <= 'Z' || s
							.charAt(left) >= '0' && s.charAt(left) <= '9'))
				left++;
			while (right >= 0
					&& !(s.charAt(right) >= 'a' && s.charAt(right) <= 'z'
							|| s.charAt(right) >= 'A' && s.charAt(right) <= 'Z' || s
							.charAt(right) >= '0' && s.charAt(right) <= '9'))
				right--;
			if (left < right) {
				if (s.charAt(left) == s.charAt(right)
						|| (Math.abs(s.charAt(left) - s.charAt(right)) == 32
								&& (s.charAt(left) >= 'a'
										&& s.charAt(left) <= 'z' || s
										.charAt(left) >= 'A'
										&& s.charAt(left) <= 'Z') && (s
								.charAt(right) >= 'a' && s.charAt(right) <= 'z' || s
								.charAt(right) >= 'A' && s.charAt(right) <= 'Z'))) {
					left++;
					right--;
				} else {
					return false;
				}
			} else
				return true;
		}
	}
}
