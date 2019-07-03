package com.scriptbees.AddAnyTwoNumbers;

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
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Plz Enter the a and b values");
         a=s.nextInt();
         b=s.nextInt();
         c=a+b;
         System.out.println("Total value: "+c);
    }
}
 