package easy;

/*
 You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);
		int[] max = new int[nums.length + 1];
		max[0] = 0;
		max[1] = nums[0];
		max[2] = Math.max(nums[0], nums[1]);
		for (int i = 3; i <= nums.length; i++) {
			max[i] = Math.max(nums[i - 1] + max[i - 2], max[i - 1]);
		}
		return max[nums.length];
	}
}
