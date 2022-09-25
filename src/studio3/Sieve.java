package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		
		if (n == 2) {
			System.out.println(n + " is a prime number!");	
		} else if (n == 3) {
			System.out.println(n-1 + " is a prime number!");
			System.out.println(n + " is a prime number!");
		} else {
			int[] allNumber = new int[n-1];
			
			for (int i = 0; i < allNumber.length; i++) {
				allNumber[i] = i+2;
			}
			
			for (int i = 0; i < allNumber.length; i++) {
				int numTested = allNumber[i];
				int notPrime = 0;
				for (int j = 2; j <= numTested/2; j++) {
					if (numTested % j == 0) {
						notPrime ++;
					}
				}
				
				if (notPrime == 0) {
					System.out.println(numTested + " is a prime number!");
				}	
			}	
		}
	}
}
