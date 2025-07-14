package collections_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List al=new ArrayList();
		
//		ArrayList<String> al1=new ArrayList<String>();
//		ArrayList<Integer> al2=new ArrayList<Integer>();
		al.add("Vaishali");
		//System.out.println();
		al.add("30");
		al.add(12);
		al.add('Z');
		al.add(20.30);
		al.add("Vaishali");
		al.add(null);
		System.out.println(al.size());
		System.out.println(al.contains("vaishali"));
		
//		System.out.println(al.indexOf("30"));
//		System.out.println(al.get(0));
		System.out.println(al);
//		ArrayList al2=new ArrayList();
//		al2.add("Sourabh");
//		al2.add("40");
//		System.out.println(al.addAll(al2));
//		System.out.println(al);
		
		Iterator it=al.iterator();
		for(Object O:al)
		{
			System.out.println(O);
		}
		
		
		
		
		
		
		
		
		
	}

}
