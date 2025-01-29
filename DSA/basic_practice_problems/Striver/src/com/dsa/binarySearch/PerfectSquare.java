package com.dsa.binarySearch;

public class PerfectSquare {
	private static boolean isSqure(int n) {
		int start =0 , end = n, mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			int square = mid *mid;
			System.out.println("Mid "+ mid);
			if(square == n) {
				return true;
			}
			else if(square>n) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=400;
		System.out.println(isSqure(n));
		

	}

}
