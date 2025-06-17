package Occurace_string;

import java.util.HashMap;

public class occurance {

	public static void main(String[] args) {
		String s="Vaishali";
		
		HashMap<Character, Integer>map=new HashMap();
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			if(!map.containsKey(c))
			{
			map.put(c, 1);
		}
			else
			{
				int cnt=map.get(c);
				map.put(c, cnt+1);
				}
			}
		System.out.println(map);
		
	}

}
