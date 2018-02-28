package com.lyk.twosum;

public class SymmetricTree {

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

	public boolean isSymmetric(TreeNode root) {
		return root==null || isSymmetricHelp(root.left,root.right);
	}
	
	public boolean isSymmetricHelp(TreeNode left,TreeNode right) {
		if(left==null || right == null) {
			return left == right;
		}
		if(left.val != right.val) {
			return false;
		}
		return isSymmetricHelp(left.left,right.right)&&isSymmetricHelp(left.right,right.left);
	}
}
