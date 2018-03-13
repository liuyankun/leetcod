
package com.lyk.twosum;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,1,5,6,4};
		System.err.println(findKthLargest(a, 3));
	}
	
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> pq = new PriorityQueue<>();
	    for(int val : nums) {
	        pq.offer(val);
	        if(pq.size() > k) {
	            pq.poll();
	        }
	    }
	    return pq.peek();
	}

}