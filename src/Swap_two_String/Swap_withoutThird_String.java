    package Swap_two_String;

public class Swap_withoutThird_String {

	public static void main(String[] args) {
		 String str1 = "Vaishali "; 
		 String str2 = "MORE "; 
		 
         System.out.println("Strings before swapping: " + str1 + " " + str2);    
        
         str1 = str1 + str2;   ///Concatenate both the string str1 and str2 and store it in str1  
        
        str2 = str1.substring(0, (str1.length() - str2.length()));     //Extract str2 from updated str1    
        str1 = str1.substring(str2.length()); //Extract str1 from updated str1       
            
        System.out.println("Strings after swapping: " + str1 + " " + str2);    
    }    


	}


