package Reverse_String;

public class Chararray_method {

	public static void main(String[] args) {
		String original="vaishali";
		String reverse="";
		int length=original.length();
		
		char a[]=original.toCharArray();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+a[i];
		}
 System.out.println("print reverse String " +reverse);
	}

		

	}


