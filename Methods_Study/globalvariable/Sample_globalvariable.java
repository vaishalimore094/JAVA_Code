package globalvariable;

public class Sample_globalvariable {
	public static int a=20;
			public int b=10;

	public static void main(String[] args)
	{
		int a=5;
		
	System.out.println("i am a main method");
	sample1();
	Sample_globalvariable d1=new Sample_globalvariable();
	d1.sample2();
	d1.sample3();
	System.out.println("staic variable is "+a);
	System.out.println("nonstatic variable is "+d1.b);//print(referance object.nonstatic int)
	
   }
    public static void sample1()
    {
    	System.out.println("i am a static method");
    }
 
     public void sample2()
     {
    	 System.out.println("I am a non static variable method");
     }
     
     public void sample3()
     {
    	 System.out.println("I am a non static2 variable method");
     } 
     
}
