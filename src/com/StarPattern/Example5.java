package com.StarPattern;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// print the below pattern 
		
		
		  /*	 ****
				 ***
				 **
				 *         */
		
		

		int n = 4;
		
		for (int i =n ;i>=1 ; i--) {
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
