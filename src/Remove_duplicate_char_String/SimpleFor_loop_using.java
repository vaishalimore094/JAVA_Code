package Remove_duplicate_char_String;

import java.util.Arrays;

public class SimpleFor_loop_using {
	
	 public static void main(String[] args)   
	    {   
	        String s = "javaTpoint is the best learning website";  
	        char str[] = s.toCharArray();  ////Converting string to character array  
	        int len = str.length;    
	        removeDuplicate(str, len);   
	    }   

	 //Creating removeDuplicates() method to remove duplicates from array 
	 
    public static void removeDuplicate(char str[], int len)   
    {   
        //Creating index variable to use it as index in the modified string   
        int count = 0;   
    
        // Traversing character array  
        for (int i = 0; i < len; i++)   
        {   
              
            int j;// Check whether str[i] is present before or not  
            for ( j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if ( j == i)    
            {   
                str[count++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, count)));   
    }   
    
    
   
	
}
