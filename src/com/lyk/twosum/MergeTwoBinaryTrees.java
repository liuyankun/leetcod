package com.lyk.twosum;


public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		

	}

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode newTree =null ;
		if(t1!=null&&t2!=null){
			newTree = new TreeNode(t1.val+t2.val);
			newTree.left = mergeTrees(t1.left, t2.left);
			newTree.right = mergeTrees(t1.right, t2.right);
		}else if(t2==null&&t1!=null){
			newTree = new TreeNode(t1.val);
			newTree.left = mergeTrees(t1.left, null);
			newTree.right = mergeTrees(t1.right, null);
		}else if(t1==null&&t2!=null){
			newTree = new TreeNode(t2.val);
			newTree.left = mergeTrees(null, t2.left);
			newTree.right = mergeTrees(null, t2.right);
		}
		return newTree;
    }
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
}
