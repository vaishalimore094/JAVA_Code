package count_String;

public class count_whitespace {

	public static void main(String[] args) 
		{
		String name =" V E L O C I T Y ";
		int count =0; //10 White Spaces
		for(int i=0; i<=name.length()-1; i++)
		{
		if(name.charAt(i)==' ')
		{
		count++;
		}
		}
		System.out.println("Total Whitespaces Parent in "+name+" is: "+count);
		}

	}


