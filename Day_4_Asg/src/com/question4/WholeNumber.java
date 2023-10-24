package com.question4;

import java.util.Scanner;

public class WholeNumber {

	public void checkNumber(int n) {
		// If n is odd, print it
		if(n % 2 == 1) {
			System.out.println("Output: " + n);
		}
		
		// If n is even, print the next multiple of 10
		
		if(n % 2 == 0) {
			int r = n % 10;
			
			n -= r;
			n += 10;
			
			System.out.println("Output: " + n);
		}
		
		
		// If n is -ve, print "Error"
		
		if(n < 0) {
			System.out.println("Output: " + "Error");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = Integer.parseInt(sc.next());
		
		System.out.println("You've entered : " + n);
		
		WholeNumber wN = new WholeNumber();
		wN.checkNumber(n);
		
		sc.close();
		
		//		Sample Input & Output:
		//		Input: 76, output: 80
		//		Input: 75, output: 75
		//		Input: -9, output: Error
	}
}
