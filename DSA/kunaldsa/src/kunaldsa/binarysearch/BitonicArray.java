package kunaldsa.binarysearch;

public class BitonicArray {
	
	public static boolean isBitonic(int[] arr) {
		int start = 0, end = arr.length-1,mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(mid+1 < arr.length && arr[mid]>arr[mid+1]) {
				return true;
			}
			else {
				start = mid+1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.println(isBitonic(arr));
		

	}

}
