package globalvariable;

public class Globallocal {
	int b=50;//global variable
	
   public static void main(String[] args) {
		System.out.println(" i am main method");
		Globallocal v1=new Globallocal();
		v1.display1();
		v1.display();
		

	}
   
	public void display()
	{
		int a=90; // local variable a
		int sum=a+10;//local variable sum
		int sub=a-b;//local variable sub global variable b
		b=sub;//changed b value to sub
		System.out.println("b modified value is" +b);
	
		System.out.println( " i am non static method ");
		System.out.println(" addition of sum is"+ sum);
		System.out.println("substraction of sub is"+ sub);
		
	}

	public void display1()
	{
		int b=10;
		int mul=b*19;
		System.out.println("multplication is"+mul);
	}
}  
