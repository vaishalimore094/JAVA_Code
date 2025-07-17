package multiple_statement;

public class Information {

	public static void main(String[] args) // defination of main method
	 {
        System.out.println("hi i am a main method");
        myinfo();
        Information V=new Information();
        V.roommentinfo("vaishali" ,"ECE" ,68.09f,'A');
        V.roommentinfo("shivanjali","ECE",68.09f,'B');
        V.roommentinfo("priti","mech",71.09f,'A');
        V.roommentinfo("shital","CSE",60.09f,'C');
	 }     
	public static void myinfo()   
	//defination of static method without parameter
   {
	  String name="vaishali More";
	  String Stream="BE";
	  float marks=68.09f;
	  char grade='A';
	  System.out.println("my name is "+ name);	 
      System.out.println("my stream is "+ Stream);
	  System.out.println("my marks is "+ marks);
	  System.out.println("my grade is "+ grade);
	  System.out.println("===================");
	  
    }
	//-------------assignment--------------------
	public void roommentinfo(String name,String stream,float marks,char grade)
	//defination of nonstatic method with parameter
	{     
		 
		  System.out.println("friend name is "+ name);	 
	      System.out.println("friend stream is "+ stream);
		  System.out.println("friend marks is "+ marks);
		  System.out.println("friend grade is "+ grade);
		  System.out.println("-----------------------");
		  
		
	}

}
