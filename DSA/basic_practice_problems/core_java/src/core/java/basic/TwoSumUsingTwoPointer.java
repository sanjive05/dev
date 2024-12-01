package core.java.basic;

public class TwoSumUsingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,7,8,9,13,15};
		int target = 15;
		
		int i = 0 , j=arr.length-1;
		
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				System.out.println("Sum found " +arr[i]+"   "+arr[j]);
				break;
			}
			else if(arr[i]+arr[j]>target) {
				j--;
			}
			else {
				i++;
			}
		}

	}

}
