package Remove_duplicate_char_String;

public class remove_duplicateforloop {

	public static void main(String[] args) {
		String str="Vaishali";
		String remove="";
		for(int i=0;i<=str.length()-1;i++)
		{
			   char ch=str.charAt(i);
			if(remove.indexOf(ch)==-1)
			{
					remove=remove+str.charAt(i);
					//indexoff---first occurance or first index position identified
			}
			}
		System.out.println(remove);
	}

	
}


