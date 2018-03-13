package com.lyk.twosum;

public class FriendCircles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private boolean[] hasFriends;
	public int findCircleNum(int[][] M) {
       int sum = 0;
       hasFriends = new boolean[M.length];
		for(int i = 0;i<M.length;i++){
			if(!hasFriends[i]){
				dfs(M, i);	
				sum++;
			}
			
		}
		return sum;
    }
	
	public void dfs(int[][] M, int i){
		hasFriends[i]=true;
		for (int k = 0; k < M[i].length; k++) {
			if( M[i][k] != 0){
				M[i][k] =0;
				dfs(M, k);
			}	
		}
	}
}
