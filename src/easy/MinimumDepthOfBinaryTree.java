package easy;

import utils.TreeNode;

/*
 Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthOfBinaryTree {
	int depth = 0;
	int min = Integer.MAX_VALUE;

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		preOrder(root);
		return min;
	}

	public void preOrder(TreeNode root) {
		if (root == null)
			return;
		depth++;
		if (root.left == null && root.right == null) {
			if (depth < min)
				min = depth;
		} else {
			preOrder(root.left);
			preOrder(root.right);
		}
		depth--;
	}
}
