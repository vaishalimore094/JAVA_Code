package Anagram_String;

import java.util.Arrays;

public class anagram {
	
//	lives-ELVIS
//	cat-act
	public static boolean isanagram(String s1,String s2) {
		String str1=s1.replaceAll("\\s","");
		String str2=s2.replaceAll("\\s","");
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else 
		{  
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
			
		}
	}

	public static void main(String[] args) {
		System.out.println(isanagram ("lives","ELVIS"));
		

	}

}
 