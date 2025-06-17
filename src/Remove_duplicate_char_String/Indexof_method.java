package Remove_duplicate_char_String;

public class Indexof_method {

	public static void main(String[] args) {
		String str="Vaishali";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
					int index=str.indexOf(ch,i+1);
					//indexoff---first occurance or first index position identified
			if(index==-1)
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

	


}
