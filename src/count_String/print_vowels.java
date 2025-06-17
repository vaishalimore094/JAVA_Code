package count_String;

public class print_vowels {

	
//		public static void main(String[] args) {
//	        // Your input string
//	        String inputString = "Vaishali";
//
//	            String vowels = inputString.replaceAll("[^aeiou]", "");
//	            System.out.println("Vowels in the string: " + vowels);
//	        
//	}
//
//}
	public static void main(String[] args) {
        // Your input string
        String inputString = "Vaishali";

        
            String consonants = inputString.replaceAll("[aeiou]", "");

            // Print the consonants
            System.out.println("Consonants in the string: " + consonants);
        
    }
}