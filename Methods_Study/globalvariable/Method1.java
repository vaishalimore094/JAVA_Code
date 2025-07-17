package globalvariable;

public class Method1 {
	
	   public  static int a=20;//global static variable
	   public int b=10;//global nonstatic variable 
	   
	   public static void main(String[] args)
	{
		//-------same class  calling by method------------
		System.out.println("i am main method");
		sample1();           //called static method
		Method1 S2=new Method1();//object creation nonstatic method
		S2.sample2();               //called nonstatic method
		
        System.out.println("calling static variable "+a); //print static variable
        int sum1=10+a;   //addition of static method
		System.out.println(sum1);
		System.out.println("calling nonstatic variable " + S2.b ); //print nonstatic variable
		int sum2=20+S2.b;
		System.out.println(sum2);
		
		
		//------different class calling by method--------------
		Differclass.sample3();
		Differclass s3=new Differclass();
		s3.sample4();
		 
	     System.out.println("calling static variable in another class "+ Differclass.c);//use of differentclass soo
	     int sum3=30+Differclass.c;
		 System.out.println(sum3);
		 System.out.println("calling nonstatic variable in another class "+s3.d);
		 int sum4=20+s3.d;
		 System.out.println(sum4);
		
		}
	public static void sample1() //defination of static variable without parameter
	{
	System.out.println("i am static method running");	
	}
    public void sample2()//defination of non static variable without parameter
    {
	  System.out.println("i am a non static method running");
	  
    }
   
 
  
   
   
}
