package Reverse_Number;

public class reverse_number3Whileloop {

	public static void main(String[] args) {
		int num=121;
		int rev=0;
		while(num>0)
		{
			 rev=num % 10;
			 System.out.print(rev);
			num=num / 10;
		}
		
		
	}

}
