package Remove_duplicate_char_String;

public class Using_StringBuilderclass {

	public static void main(String[] args) {
		String str="Vaishali";
		
	StringBuilder sb=new StringBuilder();
	
	str.chars().distinct().forEach(c-> sb.append((char) c));
	System.out.println(sb);
	}
	
	
	
	
	}

