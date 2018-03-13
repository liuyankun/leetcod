package com.lyk.twosum;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a5 = new TreeNode(5);		
		a1.left = a2;
		a1.right = a3;
		a2.left =a5;
		
		BinaryTreePaths bbt = new BinaryTreePaths();
		System.err.println(bbt.binaryTreePaths(a1));
	}
	
	private List<String> pathList;
	public List<String> binaryTreePaths(TreeNode root) {
		pathList = new ArrayList<>();
		dfs(root, "");
        return pathList;
    }
	public void dfs(TreeNode root,String head) {
		if(root == null) {
			return;
		}
		head =head+root.val+"->";
		if(root.left==null&&root.right==null) {
			pathList.add(head.substring(0,head.length()-2));
			return;
		}
		dfs(root.left, head);
		dfs(root.right, head);
		
	}
}
