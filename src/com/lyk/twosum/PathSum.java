package com.lyk.twosum;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		int reuslt = sum - root.val;
		if(reuslt==0&& root.left ==null && root.right==null) {
			return true;
		}else {
			return hasPathSum(root.left, reuslt)||hasPathSum(root.right, reuslt);
		}
		
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}