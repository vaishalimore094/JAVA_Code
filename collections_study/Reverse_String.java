package collections_study;

public class Reverse_String {

	public static void main(String[] args) {
		String s1="Vaishali";
		String Rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			 Rev=Rev+s1.charAt(i);
		}
		System.out.println("print"+ Rev);
	}

}
