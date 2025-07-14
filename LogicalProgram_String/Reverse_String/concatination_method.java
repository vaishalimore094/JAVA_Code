package Reverse_String;

public class concatination_method {

	public static void main(String[] args) {
		String original="Jayant";
		String reverse="";
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
        System.out.println("print reverse String   : " +reverse);
	}

}

// for revere string first we need to find length and need t