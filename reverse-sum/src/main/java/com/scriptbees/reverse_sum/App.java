package com.scriptbees.reverse_sum;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int n;
		System.out.println("Plz Enter the n number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		sumOfDigits(n);
		reverseNumber(n);
	}

	private static void reverseNumber(int n) {
		// TODO Auto-generated method stub
		int x,reversed = 0;
        while(n!= 0) {
            x = n % 10;
            reversed = reversed * 10 + x;
            n=n/10;
        }
        System.out.println("Reversed Number: " + reversed);

	}

	private static void sumOfDigits(int n) {
		// TODO Auto-generated method stub
		int m, sum = 0;
		while (n > 0) {
			m = n % 10;
			sum = sum + m;
			n = n / 10;

		}
		System.out.println("Sum of Digits:" + sum);
	}

}
