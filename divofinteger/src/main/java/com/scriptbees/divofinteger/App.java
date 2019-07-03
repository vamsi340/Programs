package com.scriptbees.divofinteger;

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
        System.out.println("Enter The divisors Numbers: "); 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printDivisors(n);
    }
	private static void printDivisors(int n) {
		// TODO Auto-generated method stub
		for (int i=1;i<=n;i++) 
            if (n%i==0) 
                System.out.println("divisors is: "+i); 
	}
}
