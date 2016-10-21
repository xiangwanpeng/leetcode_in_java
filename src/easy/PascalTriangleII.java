package easy;

import java.util.LinkedList;
import java.util.List;

/*
 Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new LinkedList<Integer>();
		int[] res = new int[rowIndex + 1];
		for (int i = 0; i <= rowIndex; i++) {
			res[0] = 1;
			res[i] = 1;
			for (int j = i / 2; j > 0; j--) {
				res[j] = res[j] + res[j - 1];
				res[i - j] = res[j];
			}
		}

		for (int i : res)
			list.add(i);
		return list;
	}
}
