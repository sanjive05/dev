package com.java.se8.interfaces;

public class Manager implements Employee {
	Sim sim;
	
	public Manager() {
		
	}
	
	
	public Manager(Sim sim) {
		this.sim = sim;
	}


	@Override
	public void salary() {
		System.out.println("My salary is 10LPA" +" sim ");
		sim.calling();
		
	}
	public void bonus() {
			
	}
	

}
