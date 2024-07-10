package com.StarPattern;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// print the below pattern
		
/*  
		     *
		     **
		     ***
		     ****	            */
		
		
		int n = 4;
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
