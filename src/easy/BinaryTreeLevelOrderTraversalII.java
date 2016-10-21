package easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.TreeNode;

/*
 Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]
 */
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if (root == null)
			return list;
		List<Integer> intList = new LinkedList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode t = null;
		queue.offer(root);
		int curCount = 0, curNum = 1, nextCount = 1;
		while (!queue.isEmpty()) {
			t = queue.poll();
			intList.add(t.val);
			if (t.left != null) {
				queue.offer(t.left);
				nextCount++;
			}
			if (t.right != null) {
				queue.offer(t.right);
				nextCount++;
			}
			if (++curCount == curNum) {
				list.add(0, intList);
				intList = new LinkedList<Integer>();
				curNum = nextCount;
			}
		}
		return list;
	}
}
