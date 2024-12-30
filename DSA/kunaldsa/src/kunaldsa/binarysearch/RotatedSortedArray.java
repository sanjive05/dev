package kunaldsa.binarysearch;

public class RotatedSortedArray {
	public static int findPivot(int[] arr) {
		int count =0;
		int index = -1;
		int start = 0, end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(mid <arr.length && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]<=arr[start]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,1,2,3,4,5,6,7};
		int pivotIndex = findPivot(arr);
		System.out.println(pivotIndex);
	}

}
