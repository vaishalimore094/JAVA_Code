package multiple_statement;

public class Addsubstatic {

	public static void main(String[] args)//defination of main method
	{
		System.out.println("i am a main method");
        add();
        sub(50,20);
        Addsubstatic a=new Addsubstatic();
        a.mul();
        a.division(100, 10);

	}
 public static void add() // defination of static method without parameter
	{
	   int a=50; //variable inilization
	    int b=10;
	    int sum=a+b; //add to int
	    System.out.println("addition is " + sum); //printing statement
	 }
	
  public static void sub(int a,int b)//defination of static method with parameter
    {
	    int sub=a-b;
	    System.out.println("substraction is "+sub);
     }
 
  public void mul() //defination of nonstatic method without parameter  
       { 
	      int a=30;
	      int b=10;
	      int mul=a*b;
	      System.out.println("multiplication is " +mul);
	   }
  public void division(int a,int b) //defination of nonstatic method with parameter
     { 
	    int div=a/b;
	    System.out.println("division is " + div);
	   
    }
   
 
}
