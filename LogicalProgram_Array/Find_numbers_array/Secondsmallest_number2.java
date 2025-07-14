package Find_numbers_array;

public class Secondsmallest_number2 {

	public static void main(String[] args)
	{
		int a[]= {5,8,7,9,6,5,3};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)//for swaping
				if (a[i]>a[j])
				{
					temp=a[i];
			        a[i]=a[j];
			        a[j]=temp;
				}
			
		}
		for(int i=0;i<a.length;i++)//sort first and print
		{
			System.out.print(a[i]+" ");
		}
		
		
			System.out.println(" second smallest number is "+a[1]);	
		}
		
	}


