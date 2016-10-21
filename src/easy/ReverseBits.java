package easy;

/*
 Reverse bits of a given 32 bits unsigned integer.

 For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

 Follow up:
 If this function is called many times, how would you optimize it?

 Related problem: Reverse Integer
 */
public class ReverseBits {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int firstBit;
		long result = 0;
		for (int i = 1; i <= 32; i++) {
			firstBit = n & 0x00000001;
			result += firstBit * Math.pow(2, 32 - i);
			n >>>= 1;
		}
		return (int) result;
	}
}
