package count_String;

public class Countno_of_blank_spaces {

	public static void main(String[] args) {
		String given="  Practice  makes  man perfect";//cont space
		int count=0;//1 2
		for( int i=0;i<= given.length()-1;i++)
		{
			                          
			if(given.charAt(i)==' ')
			{
				count++;
				
			}
				
		}
		System.out.println("toatal no of blank space is :"+count);
		
		

	}

}
