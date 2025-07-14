package Find_numbers_array;

public class Secondlarget_number {

	public static void main(String[] args)
	{
		int a[]= {5,2,7,9,6,5,2};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)//for swaping
				if (a[i]!=a[j])//if (a[i]>a[j])
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
		
			System.out.println(" second largest number is "+a[1]);	
		}
		
	}


