package Find_numbers_array;

public class Duplicate_number {

	public static void main(String[] args) {
		int a[]= {23,34,56,78,34,57};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j]) //&& (i!=j))
				{
					System.out.println("duplicate no is  "+a[j]);
				}
			}
			
		}
		
		

	}

}
