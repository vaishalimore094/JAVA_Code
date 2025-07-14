package collections_study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class Vector_study {

	public static void main(String[] args) {
		
		//------how to create object------------
		
		Vector v= new Vector<>();
		v.add("velocity");
		v.add("pune");
		v.add(1);
		v.add(33.3);
		v.add('v');
		System.out.println(v);
		v.add(1, "corporate");//added index basis
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println("-- 1st way for loop----------------");
		//1.for loop
		//2.for each
		//3.iterator
        //5.list iterator
		//6.enumerator
		
		//using for loops
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("-------2nd way iterator-----------------");
		
		//----using iterator----------------
		
		Iterator it=v.iterator();
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
		System.out.println("-------3rd way each-----------");
		
		//------using for each loop----------------
		
		for(Object o:v)
		{
			System.out.println(o);
			
		}
		System.out.println("-----------4thway------enumeration----");
		//------------enumeration---------------
		
		Enumeration e= v.elements();
		while(e.hasMoreElements())
		{
	       System.out.println(e.nextElement());
		}

		
		System.out.println("-----------5th way-----listiterator------");
		ListIterator li=v.listIterator();
	     while(li.hasNext()) {
			 System.out.println(li.next());
		 
		 }
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    
		

	}

}
