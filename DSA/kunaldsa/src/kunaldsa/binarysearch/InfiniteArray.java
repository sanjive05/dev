package kunaldsa.binarysearch;

public class InfiniteArray {
	public static int binary(int[] arr , int target,int start, int end) {
		int ans = -1;
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
	public static int findAns(int[] arr,int target) {
		int start = 0;
		int end = 1;
		
		while(arr[end]<target) {
			int newStart = end+1;
			end = end + (end-start+1)*2;
			start = newStart;
		}
		return binary(arr,target,start,end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,7,11,13,14,16,18,19,21};
		int target = 11;
		System.out.println(findAns(arr,target));
	}

}
