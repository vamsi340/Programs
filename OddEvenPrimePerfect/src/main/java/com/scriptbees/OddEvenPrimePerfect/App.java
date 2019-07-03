package com.scriptbees.OddEvenPrimePerfect;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int n;
		System.out.println("Plz Enter the n value");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		evenOrOdd(n);
		primeNumberOrNot(n);
		perfectOrNot(n);

	}

	private static void perfectOrNot(int n) {
		// TODO Auto-generated method stub
		int i, fact = 1;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}

	private static void primeNumberOrNot(int n) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");
	}

	private static void evenOrOdd(int n) {
		// TODO Auto-generated method stub
		if (n % 2 == 0) {
			System.out.println("Given number is even number: " + n);
		} else {
			System.out.println("Given number is odd number: " + n);
		}
	}
}
