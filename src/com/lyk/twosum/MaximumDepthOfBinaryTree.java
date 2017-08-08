package com.lyk.twosum;

public class MaximumDepthOfBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root) {
		
		if(root!=null) {
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			return left>right? ++left: ++right;
		}else {
			return 0;
		}
		
	}
	
	public void countDepth() {
		
	}
}
