package com.codeio.problems;

public class FindMinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,4,5,9,8,3,6,1,-10};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
