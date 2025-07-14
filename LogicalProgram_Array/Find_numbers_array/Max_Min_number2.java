package Find_numbers_array;

public class Max_Min_number2 {

	public static void main(String[] args) {
		int a[]= {23,34,56,78,23};
		
			int max=a[0];
			int min=a[0];
		
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]>max)
				max=a[i];//34
			}
		
					System.out.println("max no is"+max);
				
			
					for(int i=a.length-1;i>=0;i--)
						
	  {
		if(a[i]<min)
			min=a[i];
	  }

			System.out.println("min no is"+min);
		
	  }
}


