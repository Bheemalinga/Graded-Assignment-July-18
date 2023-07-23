// package Graded_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class singularity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter the arrNum length : ");
		n = input.nextInt();
		

		int []arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		int count =0;
		int flag =0;
		
		for (int i=0; i<n; i++) {
			flag =0;
			
			for(int j=i; j<n; j++) {
				if(arr[i] == arr[j]) {
					flag +=1;
				}
			}
			if(flag >=1) {
				i = i+flag-1;
			}
			if((flag != 0) && (flag % 2 != 0 )) {
				count +=1;				
			}
		}
		System.out.println("Count of singular socks = " + count);
		
		input.close();
	}

}
