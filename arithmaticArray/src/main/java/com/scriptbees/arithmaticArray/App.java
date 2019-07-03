package com.scriptbees.arithmaticArray;

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
        
        int size, i;
		Scanner s = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array  size: ");
		size = s.nextInt();	
		
		int [] a = new int[size];
		int [] b = new int[size];
		int [] Addition = new int[size];
		
		System.out.print(" Please Enter " + size + " elements of an Array1  : ");
		for (i = 0; i < size; i++)
		{
			a[i] = s.nextInt();
		}   
		System.out.print(" Please Enter " + size + " elements of an Array2  : ");
		for (i = 0; i < size; i++)
		{
			b[i] = s.nextInt();
		}  
		for(i = 0; i < size; i ++)
		{
			Addition [i]= a[i] + b[i];
		    
		}
		System.out.println("Addition of two Array is");
		for (i = 0; i < size; i++)
		{
			System.out.print(Addition[i]);
		    System.out.print("\n");
		}

    }
}
