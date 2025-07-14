package Find_Remove_sentWord;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Find_duplicatechar_String {
	public static void main(String[] args) {    
	        String string1 = "Great responsibility";    
//	             
//	        char string[] = string1.toCharArray();  //Converts given string into character array        
//	           
//	        for(int i = 0; i <string.length; i++)//Counts each character present in the string 
//	        {    
//	            int count = 1;    
//	            for(int j = i+1; j <string.length; j++)
//	            {    
//	                if(string[i] == string[j] && string[i] != ' ') 
//	                {    
//	                    count++; 
//	                    
//	                    string[j] = '0';     //Set string[j] to 0 to avoid printing visited character 
//	                }    
//	            }    
//	           
//	            if(count > 1 && string[i] != '0')     //A character is considered as duplicate if count is greater than 1    
//	                System.out.println(string[i]);    
//	        }    
//	    }

//}
	        
	             String inputString = "Vaishali More";
	            // Convert the string to lowercase (case-insensitive comparison)
	            inputString = inputString.toLowerCase();
	            // Create a linked list to store characters seen so far
	            LinkedList<Character> seenCharacters = new LinkedList<>();
	            // Create a set to store duplicate characters
	            Set<Character> duplicateCharacters = new HashSet<>();
	            // Iterate through each character in the string
	            for (char c : inputString.toCharArray())	
	            {
	                  if (seenCharacters.contains(c)) // Check if the character is already in the linked list
	                {
	                    duplicateCharacters.add(c);// If it's already in the list, it's a duplicate  
	                }
	                else
	                    {
	                        seenCharacters.add(c);// Otherwise, add it to the linked list
	                      }}
	          
	            // Print duplicate characters
	            System.out.print("Duplicate characters: ");
	            for (char duplicateChar : duplicateCharacters) {
	                System.out.print(duplicateChar + " ");
	            }
	        
	    }
	}