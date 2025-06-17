package reverse_Word_String;

public class Reservse_Word1 {

	public static void main(String[] args) {
		
		String originalString="vaishali more";
		String reverseString="";
		
		String[]words=originalString.split(" ");
		
		for(String w: words)
		{
			String reverseword="";
			for(int i=0;i>=w.length()-1;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword + " ";
			
		}
		System.out.println("print reverse string "+ reverseString);
	
	}
	
}
