package com.scriptbees.quadratic_equation;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		double a, b, c;
		double root1, root2 = 0;

		System.out.println("Plz Enter the a,b,c values");
		Scanner s = new Scanner(System.in);
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();

		double determinant = b * b - 4 * a * c;
		
		if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
		
	}
}
