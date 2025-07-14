package Find_numbers_array;

import java.util.HashMap;
import java.util.Map;

public class Repeat_numberFind {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,1,1};
		printrepeatearr(arr);

	}

	private static void printrepeatearr(int[] arr) {
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			Integer mapValue=map.get(arr[i]);
			if(mapValue==null)
			{
				map.put(arr[i], 1);
			}
			else
			{
				map.put(arr[i], mapValue+1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Integer,Integer>mapEntry : map.entrySet())
			
		{
			if(mapEntry.getValue()>1)
			{System.out.println("Key: "+mapEntry.getKey()+ " Value:"+mapEntry.getValue());
			}
		}
		
		
		
	}

}
