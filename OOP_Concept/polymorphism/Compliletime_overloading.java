package polymorphism;

public class Compliletime_overloading {

	public static void main(String[] args) {
		Compliletime_overloading ct=new Compliletime_overloading();
         ct.add(10,20);
         ct.add(10,20,30);
	}
	public void add(int a,int b) 
	{
	 int sum= a+b;
	System.out.println("addition of sum is :"+ sum);

    }
	public void add(int a, int b,int c) 
	{
		int sum=a+b+c;
	   System.out.println("addition of sum is :"+ sum);     
	}
   	
	
	
	
	
}