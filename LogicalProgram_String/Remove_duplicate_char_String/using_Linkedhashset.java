package Remove_duplicate_char_String;

import java.util.LinkedHashSet;

public class using_Linkedhashset {
	 public static void main(String args[])   
	    {   
	         
	        String str = "test Engineer";   
	        removeDuplicates(str);   
	    }  

	  //Create removeDuplicates() method for removing duplicates using LinkedHashSet  
		    static void removeDuplicates(String str)   
		    {     
		           
		        LinkedHashSet<Character> set = new LinkedHashSet<>();   //Create LinkedHashSet of type character
		         for(int i=0;i<str.length();i++) //Add each character of the string into LinkedHashSet   
		          set.add(str.charAt(i));   
		            
 // print the string after removing duplicate characters  
		         
		        for(Character ch : set)   
		            System.out.print(ch);   
		    }   
		        
		     
		    
	}
	


