// package Graded_assignment;

import java.util.Scanner;

public class arrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter arrNum length : ");
		
		try {
		n = input.nextInt();
		}
		catch(Exception e) {
			System.err.println("Invalid Input !!    Try Again !");
			System.exit(0);;
		}
		
		int [] arr = new int[n];
		
		try {
		// Taking the array as input.
		for(int i =0; i < n; i++) {
			arr[i] = input.nextInt();			
		}
		}
		
		catch(Exception e) {
			System.err.println("Invalid array Element !!!");
			System.exit(0);
		}
		
		input.close();
		
		// Cumulative multiplication.
		for(int i=1; i<n ; i++) {
			arr[i] = arr[i] * arr[i-1];
		}
		
		// Printing the Cumulative array.
		for(int i =0; i<n; i++) {
			System.out.print( arr[i] +", ");
		}
 	}

 }
