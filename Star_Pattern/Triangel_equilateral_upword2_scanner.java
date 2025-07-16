package Star_patttern;

import java.util.Scanner;

public class Triangel_equilateral_upword2_scanner {

	public static void main(String[] args) {
//		  *
//		 ***
//		*****
//	   *******
		
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of star rows");
		rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		  {
			for(int j=i;j<=rows;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
			
		}
	}

	}


