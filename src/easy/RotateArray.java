package easy;

/*
 Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

 Note:
 Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

 [show hint]

 Related problem: Reverse Words in a String II
 */
public class RotateArray {
	public void reverse(int[] nums, int left, int right) {
		int temp;
		for (int i = left; i <= (right + left) / 2; i++) {
			temp = nums[i];
			nums[i] = nums[right - (i - left)];
			nums[right - (i - left)] = temp;
		}
	}

	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		if (nums.length < 2 || k < 1)
			return;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
	}
}
