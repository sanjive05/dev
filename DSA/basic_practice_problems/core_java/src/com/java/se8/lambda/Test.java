package com.java.se8.lambda;
@FunctionalInterface
interface Country{
	public void salary(int age);
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Country india = (int age)->{
			 System.out.println("Your salary is "+ age*10000);
		 };
		 india.salary(21);
	}

}
