package core.java.basic;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans =  "";
		int n = 26;
		while(n>0) {
			int rem = n%2;
			ans+= rem;
			n/=2;
		}
		StringBuilder output = new StringBuilder(ans);
		output.reverse();
		System.out.println(output);
		

	}

}
