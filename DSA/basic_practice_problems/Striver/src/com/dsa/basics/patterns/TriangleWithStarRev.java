package com.dsa.basics.patterns;

public class TriangleWithStarRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

}
