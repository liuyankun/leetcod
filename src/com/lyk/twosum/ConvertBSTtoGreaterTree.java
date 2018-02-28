package com.lyk.twosum;

import com.lyk.twosum.SameTree.TreeNode;

public class ConvertBSTtoGreaterTree {

	private int previousValue = 0;
	
	public TreeNode convertBST(TreeNode root) {
       if(root ==null){
    	   return root;
       }
       if(root.right!=null){
    	   convertBST(root.right);
       }
       root.val += previousValue;
       previousValue =root.val;
       if(root.left!=null){
    	 convertBST(root.left);
       }       
	   return root;
    }
	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
