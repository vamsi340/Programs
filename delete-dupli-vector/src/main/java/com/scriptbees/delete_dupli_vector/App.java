package com.scriptbees.delete_dupli_vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App 
{
  
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List list=new Vector();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(30);
        list.add(50);
        
        Iterator i= list.iterator();
        System.out.println("print the vector list is");
        while(i.hasNext()){
        	System.out.println(i.next());
        	}
        //remove the depulication element in vector
        Set set=new LinkedHashSet(list);
        
        List list2=new ArrayList(set);
       
        System.out.println("Modified Vector list is ");
        Iterator i2= list2.iterator();
        while(i2.hasNext()) {
        	System.out.println(i2.next());
        }
   
    }
	
}
