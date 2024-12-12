package com.codeio.problems;

public class FindTheTransitionPoint {
	public static int findTransInd(int[] arr) {
		int count = 0;
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[i]==1) {
				System.out.println("total counts : "+count);
				return i;
			}
		}
		System.out.println("total counts : "+count);
		
		return ans;
	}
	public static int findTransBin(int[] arr) {
		int ans = -1;
		int start = 0 , end =  arr.length-1 , mid = 0 , count = 0;
		while(start<=end) {
			count++;
			mid=(start+end)/2;
			if(arr[mid]==1 && arr[mid-1]==0) {
				System.out.println(count);
				return mid;
			}
			else if(arr[mid]==1) {
				end = mid-1;
			}
			else {
				start=mid+1;
			}
		}
		System.out.println(count);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
	    System.out.println(findTransInd(arr));
		System.out.println(findTransBin(arr));
	}

}
