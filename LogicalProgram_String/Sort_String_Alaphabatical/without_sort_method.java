package Sort_String_Alaphabatical;

public class without_sort_method {

	public static void main(String[] args) {
		String s="vaishali";
		char[] arr=s.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	
		}
		
		System.out.println((arr));
	}
	

}
