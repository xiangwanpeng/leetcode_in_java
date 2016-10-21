package easy;

/*
 Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int dif = a.length() - b.length(), C = 0, curRes, curA, curB;
		if (dif > 0) {
			String temp = a;
			a = b;
			b = temp;
		} else
			dif = -dif;
		sb.append(a);
		while (dif-- > 0)
			sb.insert(0, '0');
		a = sb.toString();
		sb.delete(0, sb.length());
		for (int i = a.length() - 1; i >= 0; i--) {
			curA = a.charAt(i) - '0';
			curB = b.charAt(i) - '0';
			curRes = curA ^ curB ^ C;
			C = (curA ^ curB) & C | curA & curB;
			sb.insert(0, (char) (curRes + '0'));
		}
		if (C == 1)
			sb.insert(0, '1');
		return sb.toString();
	}
}
