package easy;

/*
 You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
	public int climbStairs(int n) {
		int a = 1, b = 2, c = 0;
		if (n == 1)
			return a;
		else if (n == 2)
			return b;
		for (int i = 0; i < n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
