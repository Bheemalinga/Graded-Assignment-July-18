// package Graded_assignment;

import java.util.Scanner;
public class missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n =0;
		
		System.out.print("Enter arrNum length : ");
		
		n = input.nextInt();
		
		int [] arr = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}

		input.close();
		
		for(int i=0; i<n; i++) {
			if(( i !=n-1 ) && ( arr[i+1] != arr[i]+1 )) {
				System.out.print((arr[i] + 1) + " " );				
				}
			}
	}

}
