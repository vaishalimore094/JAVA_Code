package reverse_Word_String;

public class Reversewordby_word_Stringbuilder1 {

	public static void main(String[] args) {
		String str="";
		String[]words=str.split("\\s ");
		String reverseword="";
		for(String w: words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
			}
			
		
		System.out.println("print reverse string "+ reverseword);
	
	}
	



	}


