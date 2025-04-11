package Paledrome_number;



public class palondromegwhileloop_Number {

	public static void main(String[] args) {
		
		int num=121;
		int temp=num;
		int revnum=0;
		int rem;
			while(temp!= 0)  //while(temp>0) 
				{
					 rem=temp % 10;
				   revnum=revnum*10 + rem;
					temp=temp/10;
				}
			System.out.println("print rev number"+ revnum);
		
	if (num==revnum)
	{
		System.out.println( " Palondrome number");
		
	}
	else
	{
		System.out.println(" NOTPalondrome number");
	}
	}
}
