package com.java.se8.interfaces;

public interface Employee {
	
	public void salary();
	public default void bonus() {
		System.out.println("Bonus is Rs.1000");
	}
}
