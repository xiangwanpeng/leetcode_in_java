/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
package easy;

import utils.TreeNode;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int l = maxDepth(root.left);
			int r = maxDepth(root.right);
			return l > r ? l + 1 : r + 1;
		}
	}
}
