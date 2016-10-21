package easy;

/*
 The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
	public String countAndSay(int n) {
		String[] strs = new String[n];
		strs[0] = "1";
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		char ch;
		for (int i = 1; i < n; i++) {
			ch = strs[i - 1].charAt(0);
			for (int j = 0; j < strs[i - 1].length(); j++) {
				if (strs[i - 1].charAt(j) != ch) {
					sb.append("" + sum + ch);
					ch = strs[i - 1].charAt(j);
					sum = 1;
				} else {
					sum++;
				}
				if (j == strs[i - 1].length() - 1) {
					sb.append("" + sum + ch);
				}
			}
			strs[i] = sb.toString();
			sb.delete(0, sb.length());
			sum = 0;
		}
		return strs[n - 1];
	}
}
