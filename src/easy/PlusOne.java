package easy;

/*
 Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int i = digits.length - 1;
		while (i >= 0) {
			if (digits[i] == 9) {
				digits[i] = 0;
				i--;
			} else {
				digits[i]++;
				break;
			}
		}
		if (i < 0) {
			int[] res = new int[digits.length + 1];
			res[0] = 1;
			for (int j = 0; j < digits.length; j++) {
				res[j + 1] = digits[j];
				return res;
			}
		}
		return digits;
	}
}
