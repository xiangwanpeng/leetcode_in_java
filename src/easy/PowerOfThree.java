package easy;

/*
 Given an integer, write a function to determine if it is a power of three.

 Follow up:
 Could you do it without using any loop / recursion?
 */
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		// use loop
		if (n <= 0)
			return false;
		while (n != 1) {
			if (n % 3 != 0)
				return false;
			n /= 3;
		}
		return true;

		// or a line without any loop/recursion:(3^20 is bigger than int)
		// return (n>0&&Math.pow(3,19)%n==0);
	}
}
