/*
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
 */
package easy;

public class SumOfTwoIntegers {
	public int getSum(int a, int b) {
		int temp = 1, prev = 0, tempA, tempB, tempRes, result = 0;
		for (int i = 0; i < 32; i++) {
			tempA = a & temp;
			tempB = b & temp;
			tempRes = tempA ^ tempB ^ prev;
			prev = ((tempA ^ tempB) & prev | tempA & tempB) << 1;
			result |= tempRes;
			temp <<= 1;
		}
		return result;
	}
}
