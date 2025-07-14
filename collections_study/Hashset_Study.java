package collections_study;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Study {

	public static void main(String[] args) {
     HashSet hs= new HashSet<>();
		
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add('a');
		hs.add(99.99);
		hs.add(90);
		
		System.out.println(hs);// insertion order random
		
//		System.out.println(hs.add("Pune"));// duplicates are not allowed
//		System.out.println(hs.add("Katraj"));
//		System.out.println(hs);
//		
//		hs.add(null);//adding null value
//		
//		System.out.println(hs);
//		
//		System.out.println(hs.add(null));
//		
//		hs.remove("Pune");
//		
//		System.out.println(hs);
//		System.out.println(hs.size());
//		System.out.println(hs.contains("Katraj"));
//		System.out.println(hs.isEmpty());
		
		//1.for loop
		//2.for each
		//3.iterator

		//2.for each
		for(Object o:hs)
		{
			System.out.println(o);
		}
		//3.iterator
		
		Iterator it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	    Object hm = hs.clone();
		System.out.println("==============");
		System.out.println(hm);
	}




	}


