package core.java.basic;

public class StringCharConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello every one how are you?";
		
		char[] arr = s1.toCharArray();

		System.out.println(arr);
		String s2 = new String(arr);
		System.out.println(s2);

	}

}
