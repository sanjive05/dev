package com.dsa.binarySearch;

public class FindTargetInRotatedArray {
	public static int binarySearch(int start,int end,int[] arr,int target) {
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	private static int pivot(int[] arr) {
		int ans = -1;
		int start = 0,  end = arr.length-1;
		int count = 0;
		while(start<end) {
			System.out.println("Count  : "+ ++count);
			int mid = (start+end)/2;
			
			if(arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(arr[start]<=arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
		int target = 45;
		int index = pivot(arr);
		System.out.println("Pivot index : "+index);
		System.out.println("Pivot index : "+arr[index]);
		int ans = -1;
		if(arr[0]<=target && target<=arr[index]) {
			ans = binarySearch(0, index, arr, target);
			
		}
		else {
			ans = binarySearch(index+1, arr.length-1, arr, target);
		}
		System.out.println("Answer : "+ans);

	}

}
