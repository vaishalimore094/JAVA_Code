package permutation_String;

public class Permutation1 {

	public static void main(String[] args) {
		String str="abc";
		String Per="";
		permitation(str,Per);
	} 
	public static void permitation(String que,String ans)
	{
		if(que.length()==0) 
		 {
			
			System.out.println(ans);
		  }
		for(int i=0;i<que.length();i++)
		{
			char ch=que.charAt(i);
			String newstring=que.substring(0, i)+que.substring(i+1);
			permitation(newstring,ans+ch);
		}
	}

}
