package com.lyk.twosum;

public class MinimumDepthofBinaryTree {

	public static void main(String[] args) {
		

	}

	public static int minDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left =0 ;
		int right = 0;
		if(root.left == null&& root.right == null) {
			return 1;
		}else {
			left = minDepth(root.left);
			right = minDepth(root.right);
		}	
		if(left ==0) {
			return ++right;
		}else if(right ==0) {
			return ++left;
		}
		return left > right? ++right : ++left;
    }
	
	class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
	}
}


