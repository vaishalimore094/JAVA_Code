package reverse_Word_String;

public class Reverse_Word3_stringBuilder {

	public static void main(String[] args) {
		String s= "xyz abc";
		String[] Word=s.split("\\s");
		StringBuilder read=new StringBuilder();
		
		for(String Words : Word) {
			StringBuilder reverseword=new StringBuilder(Words);
			reverseword.reverse();
			read.append(reverseword).append(" ");
		}
		
		String output=read.toString().trim();
		System.out.println(output);
	}

}
