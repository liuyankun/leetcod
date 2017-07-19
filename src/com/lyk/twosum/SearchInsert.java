package com.lyk.twosum;

public class SearchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sums= {1,3,5,6};
        System.out.println(searchInsert(sums, 2));
	}

	public static int searchInsert(int[] A, int target) {
		int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
