package Removeduplicate_array;

import java.util.HashSet;
import java.util.Set;

public class Using_hasset {
	 public static void main(String[] args)
	    {
	        int a[] = {1,2,1,2,3,4,5,6,4,4,5,5};
	       
	      //  removeDuplicates(a);
	   // }

	
		//public static void removeDuplicates(int a[])
	    //{ 
	        Set<Integer> hash_set = new HashSet<Integer>();
	        for (int i = 0; i<a.length; i++) 
	        {
	            hash_set.add(a[i]);
	        }  
	        System.out.print(hash_set);
	        
	    }
	   
	}


