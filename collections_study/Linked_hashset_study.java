package collections_study;

import java.util.LinkedHashSet;

public class Linked_hashset_study {

	public static void main(String[] args) {
LinkedHashSet lh= new LinkedHashSet<>();
		
		lh.add("Pune");
		lh.add("Mumbai");
		lh.add(99);
		lh.add(88.88);
		lh.add('A');
		
		System.out.println(lh);// order of insertion is maintained
		
		System.out.println(lh.add("Pune"));// adding duplicate value
		// duplicated are not allowed
		
		System.out.println(lh.add(null)); //adding null value 1st time
		System.out.println(lh);
		System.out.println(lh.add(null)); //adding null value 2nd time
		
		//1. for loop
		//2.for each
		//3. iterator
		
		
		
		
		
		
		
		

	}

}


	


