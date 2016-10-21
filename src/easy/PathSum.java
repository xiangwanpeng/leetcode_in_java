package easy;

import utils.TreeNode;

/*
 Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 5
 / \
 4   8
 /   / \
 11  13  4
 /  \      \
 7    2      1
 return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class PathSum {
	int[] path = new int[10000];
	int index = 0;

	public boolean hasPathSum(TreeNode root, int sum) {
		return preOrder(root, sum, 0);
	}

	public boolean preOrder(TreeNode root, int sum, int curSum) {
		if (root != null) {
			curSum += root.val;
			if (root.left == null && root.right == null) {
				if (curSum == sum)
					return true;
				else {
					curSum -= root.val;
					return false;
				}
			}
			return preOrder(root.left, sum, curSum)
					|| preOrder(root.right, sum, curSum);
		} else
			return false;
	}
}
