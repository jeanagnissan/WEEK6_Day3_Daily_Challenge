package Exercice;

import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		// table de Multiplication 
		System.out.println("Multiplication Table:");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(num * i * j + " ");
			}
			System.out.println();
		}

		// Calcule du Factorial
		System.out.println("\nFactorial: " + factorial(num));

		//  sequence de Fibonacci
		System.out.println("\nFibonacci Sequence:");
		int a = 0, b = 1, c;
		do {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		} while (a <= num);

	}
	
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
