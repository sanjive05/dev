package core.java.basic;



public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101010;	
		int power =1;
		int ans = 0;
		while(n>0) {
			int digit = n%10;
			if(digit!=0) {
			   ans+= power;
			   System.out.println("Ans : " + ans +" Digit  "+digit);
			}
			power*=2;
			n/=10;
			
		}
		System.out.println(ans);
	}

}
