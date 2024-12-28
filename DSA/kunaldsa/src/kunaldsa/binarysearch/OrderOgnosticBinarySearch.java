package kunaldsa.binarysearch;

public class OrderOgnosticBinarySearch {

	public static int binary(int[] arr , int target) {
		int ans = -1;
		int start =0 , end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
			}
			if(isAsc) {
			    if(target>arr[mid]) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			else {
				 if(target<arr[mid]) {
						start = mid+1;
					}
					else {
						end = mid-1;
					}
				
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int [] arr = {-7,-6,-2,-1,2,4,5,7,9,11,13,15,17};
		int target = -2;
		int ans = binary(arr,target);
		System.out.println(ans);

	}

}
