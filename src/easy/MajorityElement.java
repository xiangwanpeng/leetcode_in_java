package easy;

/*
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int temp = nums[0], times = 0;
		for (int i : nums) {
			if (times == 0) {
				temp = i;
			}
			if (temp == i)
				times++;
			else {
				times--;
			}
		}
		return temp;
	}
}
