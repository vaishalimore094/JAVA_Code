package reverse_Word_String;

public class Reversewordbywooord {

	public static void main(String[] args) { 
	
//		String str = "w3schools";
//		  int cnt = 0;
//		  char[] inp = str.toCharArray();
//		  System.out.println("Duplicate Characters are:");
//		  for (int i = 0; i < str.length(); i++) 
//		  {
//		   for (int j = i + 1; j < str.length(); j++) 
//		   {
//		    if (inp[i] == inp[j])
//		    {
//		     System.out.println(inp[j]);
//		     cnt++;
//		     break;
//		}
		String s="Vaishali ";
		char[] ch=s.toCharArray();
		System.out.println("orignal string is "+s);
		System.out.println("dublicate string is: ");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]+" ");	
                                                          }
                                               }

		}}
}
