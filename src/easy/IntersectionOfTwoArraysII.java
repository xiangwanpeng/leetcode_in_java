package easy;

import java.util.Hashtable;
import java.util.Map;

/*
 Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] temp = new int[nums1.length];
		int index = 0;
		Map<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for (int i : nums1) {
			if (table.get(i) == null)
				table.put(i, 1);
			else
				table.put(i, table.get(i) + 1);
		}
		for (int i : nums2) {
			if (table.get(i) != null && table.get(i) != 0) {
				temp[index++] = i;
				table.put(i, table.get(i) - 1);
			}
		}
		int[] res = new int[index];
		while (index > 0) {
			res[index - 1] = temp[index - 1];
			index--;
		}
		return res;
	}
}
