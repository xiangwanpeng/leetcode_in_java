package easy;

/*
 Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

 Note:
 n is positive and will fit within the range of a 32-bit signed integer (n < 231).

 Example 1:

 Input:
 3

 Output:
 3
 Example 2:

 Input:
 11

 Output:
 0

 Explanation:
 The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */
public class NthDigit {
	public int findNthDigit(int n) {
		int len = 1;
		long num = 9, start = 0;
		while (n > num * len) {
			n -= len * num;
			start += num;
			len++;
			num *= 10;
		}
		int res;
		if (n % len == 0) {
			res = ("" + (start + n / len)).charAt(len - 1) - '0';
		} else {
			res = ("" + (start + n / len + 1)).charAt(n % len - 1) - '0';
		}
		return res;
	}
}
