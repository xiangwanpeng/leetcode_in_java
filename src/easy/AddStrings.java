package easy;

/*
 Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings {
	public String addStrings(String num1, String num2) {
		int n1, n2, sum, status = 0, minLen, maxLen;
		if (num1.length() > num2.length()) {
			minLen = num2.length();
			maxLen = num1.length();
			int i = maxLen - minLen;
			while (i-- > 0)
				num2 = "0" + num2;
		} else {
			minLen = num1.length();
			maxLen = num2.length();
			int i = maxLen - minLen;
			while (i-- > 0)
				num1 = "0" + num1;
		}
		StringBuilder sb = new StringBuilder();

		for (int i = num1.length() - 1; i >= 0; i--) {
			n1 = num1.charAt(i) - '0';
			n2 = num2.charAt(i) - '0';
			sum = n1 + n2 + status;
			if (sum < 10) {
				sb.insert(0, (char) ('0' + sum));
				status = 0;
			} else {
				sb.insert(0, (char) ('0' + sum % 10));
				status = 1;
			}
		}
		if (status == 1)
			sb.insert(0, '1');
		return sb.toString();
	}
}
