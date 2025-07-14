package collections_study;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_liststudy {

	public static void main(String[] args) {
			//----to create object---
	    ArrayList al=new ArrayList();//-- generic  -will accept all data type
	    ArrayList<String> al1=new ArrayList<String>();//--only string data will be accepted
	    //---how to add element-----
	   // System.out.println(al);//initially created empty array list
	    al.add("mahesh");
	    System.out.println(al);
        al.add(30);
//	    al.add(6.7);
	    al.add('A');
	    System.out.println(al);
//	    al.add(1, "tata");//----right shift operation after manupulation
//	    System.out.println(al);
//	    al.remove(2);
//	    System.out.println(al);//---removie index basis
//	    al.clear();//--remove all element
//	    System.out.println(al);
//	    al.add("ram");
//	    al.add("sita");
//	    al.add("ravan");
//	    System.out.println(al);
//	 al.add(1,"ram");//----duplicate value allowed
//	 System.out.println(al);
//	 al.add(null);//--add null value
//	 al.add(2, null);//---rught shift null value
//	 System.out.println(al);//--any no of null values allowed
//	 System.out.println(al.contains("ram"));
//	 
//	 System.out.println(al.get(0));//----print string value
//	 System.out.println(al.isEmpty());//--not empty array twy false
//	 System.out.println(al.indexOf("ram"));//--consider only fisrt index value of array
//	 System.out.println(al.size());
//	 System.out.println("------------forloop----------------------");
	 
	        //1.for loop
			//2.for each
			//3.iterator
	        //4.list iterator
	 
	 //------------1st way for using loops----------------------1
	 
//	for(int i=0;i<=al.size()-1;i++)
//	 {
//		System.out.println(al.get(i));
//		 
//	 }
//	System.out.println("----------iterator-------------------------");
	
	// 2nd way--using iterator-----how to use iterator------------2
	
	//create object of iterator
	
//	 Iterator it=al.iterator();
//	 while(it.hasNext()) 
//	 {
//		 System.out.println(it.next());
//	 
//	 }
//	    System.out.println("----------each loop---------------------");
//	    
//	    
//	    //-------3rd way-------for each loops-------------------------3
//	    
//	    for(Object o:al)
//	    {
//	    	System.out.println(o);
//	    }
	    
//	    System.out.println("-------------listiterator---------------------------");
//	 //-----------------4th way--------listiterator--------------------4
//	    
//	    ListIterator li=al.listIterator();
//	     while(li.hasNext()) {
//			 System.out.println(li.next());
//		 
//		 }
//	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    
	    
	    //-----------by using string data-------------
	    
	   // al1.add("hi");
	   // al1.add("Good");
	   // al1.add("morning");
	 
	    //------iterator---------------------------------------------1
	    
	    //Iterator<String>it1=al1.iterator();
	   // while(it1.hasNext())
	   // {
	   // 	System.out.println(it1.next());
	   // }
	   // System.out.println("-----------------");
	    
	   // ------------for loop-----------------------------------------2
	    
	   // for(String s:al1)
	   // {
	    //	System.out.println(s);
	  //  }
	    
	    //-----------list iterator--------------------------------------------3
	    
	  //  System.out.println("--------listiterator---------------");
	  //  ListIterator li=al1.listIterator();
	   //  while(li.hasNext()) {
		//	 System.out.println(li.next());
		 
		// }
		 //   System.out.println("-------------------------------");
		    
		    
		    //-------by using for each loops----------------------------4
		    
		  //  for(Object ol:al)
		  //  {
		   // 	System.out.println(ol);
		  //  }
		  //  System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		    
		    
	   
		}


	}


