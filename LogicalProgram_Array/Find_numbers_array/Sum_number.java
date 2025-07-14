package Find_numbers_array;

public class Sum_number {

	public static void main(String[] args) 
	{ 
	int num=12345;
	int revnum=0;
	int temp;
	int rem;
	temp=num; 
	while(temp>0)
	 {
	        rem=num%10; 
	        revnum=(revnum*10)+rem;
	        temp=temp/10;
	 } 
	System.out.println("The reverse number is "+temp); 
	}
}
