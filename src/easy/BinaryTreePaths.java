package easy;

import java.util.LinkedList;
import java.util.List;

import utils.TreeNode;

/*
 Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

 1
 /   \
 2     3
 \
 5
 All root-to-leaf paths are:

 ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
	int[] path = new int[100];
	int index = 0;

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new LinkedList<>();
		preOrder(root, list);
		return list;
	}

	public void preOrder(TreeNode root, List<String> list) {
		if (root != null) {
			path[index++] = root.val;
			if (root.left == null && root.right == null) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < index - 1; i++)
					sb.append("" + path[i] + "->");
				sb.append(path[index - 1]);
				list.add(sb.toString());
			}
			preOrder(root.left, list);
			preOrder(root.right, list);
			index--;
		}
	}
}
