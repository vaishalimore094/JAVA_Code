package Find_Remove_sentWord;

public class Print_LongestWord_String {

	public static void main(String[] args) {
		String s="Vaishali More";
		String[] str=s.split(" ");
		String lon=" ";
		for(String v : str)
		{
			if(v.length()>lon.length())
			{
				lon=v;
			}
			
		}
		System.out.println(lon);
	}

}