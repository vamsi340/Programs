package com.scriptbees.least_common_divisor;

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
 
        int num, den,num2,den2; 
        System.out.println("Plz Enter the unm,den and unm2,den2 values");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        den=s.nextInt();
        num2=s.nextInt();
        den2=s.nextInt();
        
        printSum(num, den, num2, den2); 
    }

	private static void printSum(int num, int den, int num2, int den2) {
		// TODO Auto-generated method stub
		int lcd = lcm(den, den); 
	    
        num *= (lcd / den);  
        num2 *= (lcd / den2);  
      
        int res_num = num + num2; 
          
        System.out.print( res_num + "/" + lcd); 
	}

	private static int lcm(int den, int den2) {
		// TODO Auto-generated method stub
		 return (den * den2) / gcd(den, den2); 
	}

	private static int gcd(int den, int den2) {
		// TODO Auto-generated method stub
		if (den == 0) 
            return den2; 
              
        return gcd(den2 % den, den); 
	}
}
