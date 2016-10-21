package easy;

/*
 Description:

 Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
	private boolean[] status;

	public int countPrimes(int n) {
		int count = 0, i, j;
		status = new boolean[n];
		for (i = 2; i < n; i++) {
			status[i] = true;
		}
		for (i = 2; i < n; i++) {
			if (status[i] == true) {
				count++;
				for (j = i; j < n; j += i)
					status[j] = false;
			}
		}
		return count;
	}
}
