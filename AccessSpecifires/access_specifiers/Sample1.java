package access_specifiers;

public class Sample1 {

	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.vaishali();//calling public method
		s1.jayant();//calling private method
		s1.reshma();//calling protected method
		s1.sourabh();//calling default method
		
		
	}
	public void vaishali() 
	{
		System.out.println("this is a public method" );
		
    }
     private void jayant()
   {
    	 System.out.println("this is a private method");
	
    }

       void sourabh()
   {
    	 System.out.println("this is a default method");
    	 
	}
     protected  void reshma()
     {
     System.out.println("this is a protected method");
     
    }

}
