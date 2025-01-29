package com.dsa.binarySearch;

import java.util.Arrays;

public class ArrayRotationAnti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		
		int k = 3;
		
		for(int i=0;i<k;i++) {
			int data = arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			 arr[0] = data;
			 System.out.println(Arrays.toString(arr));
		}

	}

}
