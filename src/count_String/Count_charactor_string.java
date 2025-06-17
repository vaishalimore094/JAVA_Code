package count_String;

public class Count_charactor_string {

	public static void main(String[] args) 
	{
		String s="i vaishali more";//define one string
		int count=0;//define total count initially 0
		
		for(int i=0;i<=s.length()-1;i++)
		 {
			if(s.charAt(i)!=' ')//0,
			{
				count++;
			}
		  }
		System.out.println("total count is  "+count);
	}
}
