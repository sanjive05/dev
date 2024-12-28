package kunaldsa.binarysearch;

public class FloorOfNumber {
	
	public static int binary(int[] arr, int target) {
		int start = 0, end = arr.length-1, mid =0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,5,7,13,15,16,18};
		int target =17;
		int ans = binary(arr,target);
		System.out.println(ans);
		

	}

}
