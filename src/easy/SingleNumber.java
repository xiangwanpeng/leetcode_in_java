/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i))
				set.remove(i);
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}
}
