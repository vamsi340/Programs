package com.scriptbees.sumofsequence;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        double n = 0; 
        System.out.println("Plz enter the number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println("Sum: " + sumOfSeries(n)); 
    }
	private static double sumOfSeries(double n) {
		// TODO Auto-generated method stub
		double res = 0, fact = 1; 
        for (int i = 1; i <= n; i++) 
        { 
            fact = fact * i; 
            res = res + (i / fact); 
        } 
        return(res); 
	}
}

