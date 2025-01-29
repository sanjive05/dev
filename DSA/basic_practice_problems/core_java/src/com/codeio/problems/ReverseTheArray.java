package com.codeio.problems;

import java.util.Arrays;

public class ReverseTheArray {
	private static void reverse(int[] arr) {
		int start = 0, end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

}
