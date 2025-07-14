package count_String;

public class Print_uppercase_char {

//	public static void main(String[] args) {
//		String s="Vaishali More";
//		for(int i=0;i<=s.length()-1;i++)
//		{
//		char ch=s.charAt(i);
//		if(Character.isLowerCase(ch))
//		System.out.print(ch);
//		}
//		
//
//	}
//
//}
	public static void main(String[] args) {
		String s="Vaishali More";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
			count++;
		
		}
		System.out.print(count);
		

	}

}
