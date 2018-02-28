package com.lyk.twosum;

import java.util.Stack;

public class SubtreeOfAnotherTree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		Stack<TreeNode> stack =new Stack<>();
		stack.push(s);
		while(!stack.isEmpty()){
			TreeNode current = stack.pop();
			if(current.val==t.val){
				if(isSameTree(current, t)){
					return true;
				}
			}
			if(current.left!=null){
				stack.push(current.left);
			}
			if(current.right!=null){
				stack.push(current.right);
			}
		}		
		return false;
    }
	public boolean isSameTree(TreeNode s,TreeNode t){
		if(s.val==t.val){
			if(s.right==null&&t.right!=null||s.right!=null&&t.right==null
					||s.left==null&&t.left!=null||s.left!=null&&t.left==null){
				return false;
			}else{
				boolean left=true,right=true;
				if(s.right!=null){
					left=isSameTree(s.right, t.right);
				}
				if(s.left!=null){
					right=isSameTree(s.left, t.left);
				}
				return left&&right;
			}
		}
		return false;	
	}
	
	
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}

}
