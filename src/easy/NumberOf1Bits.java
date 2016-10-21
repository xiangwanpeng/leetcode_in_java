package easy;

/*
 Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class NumberOf1Bits {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int result = 0, temp;
		while (n != 0) {
			temp = n & 0x00000001;
			if (temp == 1)
				result++;
			n >>>= 1;
		}
		return result;
	}
}
