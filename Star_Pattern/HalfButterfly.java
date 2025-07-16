package Star_patttern;

import java.util.Scanner;

public class HalfButterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*        *
		//**      **
		//***    ***
		//****  ****
		//**********
		
		int rows=0;
		int space=(rows*2)-2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space=space-2;
		}
	}

}
