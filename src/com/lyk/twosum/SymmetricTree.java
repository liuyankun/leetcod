package com.lyk.twosum;

import java.util.LinkedList;
import java.util.Queue;

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
		Queue<TreeNode> queue = new LinkedList<>();
		if(root == null||(root.left==null&& root.right==null)) {
			return true;
		}
		
		
		return false;
	}
}
