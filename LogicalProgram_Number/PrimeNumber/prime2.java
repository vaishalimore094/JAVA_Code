package Prime_number;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		
		// E.g 2,3,4,5,6,7,8,9,10,11
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		int rem;        
		for(int i=2; i<num; i++)
		  {
			rem=num%i;
		     if(rem == 0)//
		    {
		    count=count++;
	        }
		    }
		System.out.println("print Number"+ num);
	 if(count>0)
	 {
		 
		   System.out.println("Given Numbe54ufoooooooor is Non-Prime ");
		}
		else
		{
		System.out.println("Given Number is Prime");
		}


	}

}
//Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//In other words, prime numbers can't be divided by other numbers than itself or 1.
//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
