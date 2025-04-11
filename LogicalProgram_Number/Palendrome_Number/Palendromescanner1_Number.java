package Paledrome_number;

import java.util.Scanner;

public class Palendromescanner1_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=0;
		int rem;
		int temp=num;
				while(temp!=0)
				{
					rem=temp%10;
					rev=rev*10 +rem; 
					temp=temp/10;
				}
		System.out.println("reversre number is "+rev);
	
	if (num==rev)
	{
		System.out.println( " Palondrome number");
		
	}
	else
	{
		System.out.println(" NOTPalondrome number");
	}
	}
}

