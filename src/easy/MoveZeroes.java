package easy;

/*
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int i = 0, j = 0;
		for (int num : nums) {
			if (num == 0)
				i++;
			else
				nums[j++] = num;
		}
		for (int k = nums.length - 1; k > nums.length - 1 - i; k--)
			nums[k] = 0;
	}
}
