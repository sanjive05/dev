package com.java.se8.lambda;

import java.util.stream.IntStream;

@FunctionalInterface
interface Country{
	public void salary(int age);
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int total = 0;
		 for(int i=0;i<=50;i++) {
			 total+= i;
		 }
		 System.out.println("Total : "+total);
		 int total1 = IntStream.rangeClosed(0, 50).sum();
		 System.out.println("Total : "+total1);
	}

}
