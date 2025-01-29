package com.java.se8.lambda;

@FunctionalInterface
interface Interface1{
	void add();
	
}
public class FuntionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
				
			}
		};
		
		Runnable t1 = () -> System.out.println("Hello from t1");
		
		new Thread(t1).start(); 
	
		new Thread(r).start();
		
		new Thread(()-> System.out.println("Thread 3...")).start();
		
		
	}

}
