package collections_study;

import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {
		
TreeSet t= new TreeSet<>();
		
		t.add("Pune");
		t.add("Mumbai");
		t.add("Nagpur");
		t.add("Amaratvati");
		
		System.out.println(t);//order of insertion- Asscending order
		System.out.println(t.add("Pune"));//doesn't allow duplicate 
		//null values: not allowed--> if we tried-->NullPointerException
		//System.out.println(t.add(null));// adding null value
		
		//System.out.println(t.add(null));
		
				//1. for loop
				//2.for each
				//3. iterato
		
		//t.add(80);
		//System.out.println(t);//ClassCastException--> if we try to add diff type of data
		
		
		TreeSet t1= new TreeSet<>();
		t1.add(99);
		t1.add(1);
		t1.add(80);
		t1.add(70);
		t1.add(0);
		
		System.out.println(t1);
		
//		for(int i=0;i<=t1.size()-1;i++)
//		{
//			System.out.println(t1.g);
//		}
		
		for(Object o: t1)
		{
			System.out.println(o);
		}
		
		
		

	}



	}


