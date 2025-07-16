package constructor_study;

public class CS1 {
	//------using default constructor-------
	//public CS1{
		
	//}

	public static void main(String[] args)
	{
		System.out.println("i am a main method");
	    CS1 s1=new CS1();
	    s1.display();
	}
		
     public void display()
	{
	System.out.println("i am non static without parameter");	
	}
}
//note--if constructor is not deleclared in java class at a time
//compilelation compliler will provide constructor known as default constructor
