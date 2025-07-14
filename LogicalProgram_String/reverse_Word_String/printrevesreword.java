package reverse_Word_String;

public class printrevesreword {

	
		 public static void main(String args[])
		 {
			 String str=" I am Vaishali";
		      String s[] = str.split(" "); 
		      String ans = " "; 
		      for (int i = s.length - 1; i >= 0; i--) { 
		        ans=ans+ s[i] + " "; 
		      } 
		      System.out.println("Reversed String: " + ans); 
		    }
		
	}


