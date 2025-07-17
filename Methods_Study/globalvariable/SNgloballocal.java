package globalvariable;

public class SNgloballocal {
	int a=20;
	static int b=35;
    String name= "vaishali";

	public static void main(String[] args)
	{
		System.out.println("i am a main method");
		SNgloballocal s1=new SNgloballocal();
		s1.substraction();
		addition();
     System.out.println( "my name is"+s1.name);
     SNdiff s2=new SNdiff();
     s2.sample1();
     System.out.println("value of c is :" + s2.c);
     System.out.println("value of b  is " +s2.b);
     
    
     }
	public static void addition()
	{
		
		System.out.println("value of b is :"+b);
		
	}
	public void substraction() 
	{
	
		int c=30;
		int d=25;
		int sub=c-d;
		sub=a;
		System.out.println("substraction of sub :"+sub);
      System.out.println("modified value of a"+a);
      
	}
	

}
