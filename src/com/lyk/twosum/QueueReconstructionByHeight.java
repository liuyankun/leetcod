package com.lyk.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int[][] reconstructQueue(int[][] people) {
        if(people==null || people.length==0 || people[0].length==0){
        	return new int[0][0];
        }
		
		Arrays.sort(people, (int[] a, int[] b)->{
			if(a[0] == b[0]) return a[1] - b[1];
	           return b[0] - a[0];
		});
		
		List<int[]> list = new ArrayList<>();
		for(int i = 0;i <people.length;i++){
			list.add(people[i][1],new int[]{people[i][0], people[i][1]});
		}
		int[][] result = new int[people.length][2];
		for(int i = 0;i<people.length;i++){
			result[i][0] = list.get(i)[0];
			result[i][1] =list.get(i)[1];
		}
		
		return result;
    }

}
