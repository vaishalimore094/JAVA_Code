package constructor_study;

public class CS2 {
	//-----userdefined constructor using without parameter-------------------------------------------------
	//================================================================================================================================== 
	String name ;// nonstatic global variable declecaration
	String city;//
	public CS2()// user defined constructor
	{
	  name="velocity";//variable initilization
	  city="pune";
	}
	
	public static void main(String[] args)
	{
      System.out.println("i am constructor main method ");
      CS2 s2=new CS2();
      s2.disply1();
	}
   
    public void disply1()//define nonstatic method
    {
    System.out.println("i am nonstatic display1 in without parameter");
    System.out.println("my name is "+ name);
    System.out.println("My city is "+ city);
    }
    
}//note-public CS2(constructor)is defined by programmer withoutparameter so 
// it is called user defined constructor without parameter

