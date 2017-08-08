package com.lyk.twosum;

public class SameTree {
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

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q== null) {
			return true;
		}else if(p !=null&&q ==null ||p ==null&&q!=null ) {
			return false;
		}else {
			if(p.val==q.val) {
			 return	isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
			}else {
				return false;
			}
		}
		
	}
}
