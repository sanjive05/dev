package kunaldsa.binarysearch;

public class BinarySearch {
	public static int binary(int[] arr , int target) {
		int ans = -1;
		int start =0 , end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,4,5,6,7,11,12,15,17,18,21,22,24,30,34,36,40};
		int target = 22;
		int ans = binary(arr,target);
		System.out.println(ans);

	}

}
