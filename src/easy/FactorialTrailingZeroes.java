package easy;

/*
 Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int res = 0;
		while (n > 0) {
			res += n / 5;
			n /= 5;
		}
		return res;
	}
}
