package Star_patttern;

import java.util.Scanner;

public class butterfly {

	public static void main(String[] args) {
			//*            *
			//**          **
			//***        ***
			//****      ****
			//*****    *****
			//****      ****
			//***        ***
			//**          **
			//*            * 
		//( Remember : Star Space Space Star)
		 int rows;
		 int i;
		 int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
				rows=sc.nextInt();
		    
			for( i=1; i<=rows; i++) //Outer for loop used for No. of Rows = 9
			{
			for( j=i; j<=rows; j++) // Inner For loop for Star(Left)
			{
			System.out.print("");
			}
			for(int k=1;k<=i; k++) // Inner For loop for space(Left)
			{
			System.out.print("*");
			}
			System.out.println();
			}
			for(int n=rows;n>=1;n--)
			{
			for(int m=n; m>rows; m++)
			{
			System.out.print("");
			}
			for(int l=1; l<=n;l++)
			{
			System.out.print("*"); // Inner For loop for Star(Right)
			}
			
			System.out.println();
			}
		

	}
}



