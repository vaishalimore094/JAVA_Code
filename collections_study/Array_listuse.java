package collections_study;

import java.util.ArrayList;

public class Array_listuse {

	public static void main(String[] args) {
		
		//----to create object---
		
    ArrayList al=new ArrayList();// generic---will accept all data type
    
  // ArrayList<String> al1=new ArrayList<String>();//--only string data will be accepted
   
    //---how to add element-----
   
    System.out.println(al);//initially created empty array list
    al.add("mahesh");
    System.out.println(al);
    al.add(30);
    al.add(6.7);
    al.add('A');
    System.out.println(al);
     al.add(1, "tata");//----right shift operation after manupulation
    System.out.println(al);
    al.remove(2);
    //al.remove(3);//---dont operate worst choice
     System.out.println(al);//---removie index basis
    // al.clear();//--remove all element
    System.out.println(al);
    al.add("ram");
    al.add("sita");
   al.add("ravan");
    System.out.println(al);
   al.add(1,"ram");//----duplicate value allowed
   System.out.println(al);
   al.add(null);//--add null value
   al.add(2, null);//---right shift null value
  System.out.println(al);//--any no of null values allowed
   System.out.println(al.contains("ram"));//---search element present or not
 
   System.out.println(al.get(1));//----print string value----retrivevalue---best choice
 System.out.println(al.isEmpty());//--not empty array twy false
  System.out.println(al.indexOf("ram"));//--consider only fisrt occurance value of array
System.out.println(al.size());

//  for(int i=0;i<=al.size()-1;i++)
// {
//	System.out.println(al.get(i));
//	 
// }
 
    
	}

}
