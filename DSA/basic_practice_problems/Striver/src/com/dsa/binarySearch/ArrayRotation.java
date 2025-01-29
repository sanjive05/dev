package com.dsa.binarySearch;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		
		int k= 8;
		
		for(int i=0;i<k;i++) {
			int data = arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1] = data;
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
